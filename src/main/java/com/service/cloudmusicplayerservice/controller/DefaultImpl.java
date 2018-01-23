package com.service.cloudmusicplayerservice.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-23T15:16:29.332Z")

@RestSchema(schemaId = "default")
@RequestMapping(path = "/cloudMusicPlayerService", produces = MediaType.APPLICATION_JSON)
public class DefaultImpl {

    @Autowired
    private DefaultDelegate userDefaultDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userDefaultDelegate.helloworld(name);
    }

}
