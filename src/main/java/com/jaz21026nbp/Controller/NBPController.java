package com.jaz21026nbp.Controller;

import com.jaz21026nbp.Service.NBPservice;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
public class NBPController {

    private NBPservice nbPservice;

    public NBPController(NBPservice nbPservice){
        this.nbPservice = nbPservice;
    }

    @Operation(summary = "Get average price of given currency between given dates")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the average value",
                    content = { @Content(mediaType = "text/plain",
                            schema = @Schema(implementation = String.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid request or 93 days limit exceeded",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Data not found",
                    content = @Content)})
    @GetMapping("/nbp/{currency}/{startDate}/{endDate}")
    @ResponseBody
    public float returnAverage(@ApiParam(value = "Currency", required = true, example = "GBP") @PathVariable String currency,@ApiParam(value = "Start date", required = true)  @PathVariable String startDate,@ApiParam(value = "End date", required = true)  @PathVariable String endDate){
        return nbPservice.returnAverage(startDate,endDate,currency);
    }
}
