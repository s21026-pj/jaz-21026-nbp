package com.jaz21026nbp.Controller;

import com.jaz21026nbp.Service.NBPservice;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
public class NBPController {

    private NBPservice nbPservice;

    public NBPController(NBPservice nbPservice){
        this.nbPservice = nbPservice;
    }

    @ApiOperation(value = "Return average value of given currency", notes = "If you provide name of currency and two dates you will get average ")
    @GetMapping("/nbp/{currency}/{startDate}/{endDate}")
    @ResponseBody
    public float returnAverage(@PathVariable String currency, @PathVariable String startDate, @PathVariable String endDate){
        return nbPservice.returnAverage(startDate,endDate,currency);
    }
}
