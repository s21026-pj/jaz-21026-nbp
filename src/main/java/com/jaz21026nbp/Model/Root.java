package com.jaz21026nbp.Model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel("Root data")
public class Root{
    @ApiModelProperty("Table of root")
    public String table;
    @ApiModelProperty("Currency of root")
    public String currency;
    @ApiModelProperty("Code of root")
    public String code;
    @ApiModelProperty("List of rates for this root")
    public List<Rate> rates;
}