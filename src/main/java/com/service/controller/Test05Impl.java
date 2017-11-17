package com.service.controller;

import com.service.model.Person;

import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringCodegen", date = "2017-11-17T13:34:11.386Z")

@RestSchema(schemaId = "test05")
@RequestMapping(path = "/test05", produces = MediaType.APPLICATION_JSON)
public class Test05Impl {

    @Autowired
    private Test05Delegate userTest05Delegate;


    @RequestMapping(value = "/add",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public Integer add( @RequestParam(value = "a", required = true) Integer a, @RequestParam(value = "b", required = true) Integer b){

        return userTest05Delegate.add(a, b);
    }


    @RequestMapping(value = "/sayhei",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String sayHei( @RequestHeader(value="name", required=true) String name){

        return userTest05Delegate.sayHei(name);
    }


    @RequestMapping(value = "/sayhello/{name}",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    public String sayHello( @PathVariable("name") String name){

        return userTest05Delegate.sayHello(name);
    }


    @RequestMapping(value = "/sayhi",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String sayHi( @RequestParam(value = "name", required = true) String name){

        return userTest05Delegate.sayHi(name);
    }


    @RequestMapping(value = "/saysomething",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    public String saySomething( @RequestParam(value = "prefix", required = true) String prefix, @RequestBody Person user){

        return userTest05Delegate.saySomething(prefix, user);
    }

}
