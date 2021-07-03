package com.jaz21026nbp.Controller;

import com.jaz21026nbp.Service.NBPservice;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NBPController {

    private NBPservice nbPservice;

    public NBPController(NBPservice nbPservice){
        this.nbPservice = nbPservice;
    }
}
