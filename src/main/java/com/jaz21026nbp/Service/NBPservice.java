package com.jaz21026nbp.Service;

import com.jaz21026nbp.Model.Rate;
import com.jaz21026nbp.Model.Root;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@Service
public class NBPservice {

    private final RestTemplate restTemplate;

    public NBPservice(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public float returnAverage(String startDate, String endDate , String nOfCurrency){
        String url = "http://api.nbp.pl/api/exchangerates/rates/a/" + nOfCurrency + "/" + startDate + "/" + endDate +"/?format=json\"";
        Root result = restTemplate.getForObject(url, Root.class);
        float average = 0;
        int nOfDays=0;
        for(Rate r: result.rates){
            average += r.mid;
            nOfDays++;
        }
        average/=nOfDays;
        return average;
    }
}