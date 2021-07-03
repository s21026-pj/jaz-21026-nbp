package com.jaz21026nbp.Model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Rate data")
public class Rate {
    @ApiModelProperty("Number of rate")
    public String no;
    @ApiModelProperty("Date of rate")
    public String effectiveDate;
    @ApiModelProperty("Average value of rate")
    public double mid;
}
