package com.jaz21026nbp.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="logs")
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long entryID;
    private String currency;
    private String startDate;
    private String endDate;
    private float average;
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    public Entry(String currency, String startDate, String endDate, float average, Date timestamp) {
        this.currency = currency;
        this.startDate = startDate;
        this.endDate = endDate;
        this.average = average;
        this.timestamp = timestamp;
    }

    public Entry() {

    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDay) {
        this.startDate = startDay;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDay) {
        this.endDate = endDay;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
