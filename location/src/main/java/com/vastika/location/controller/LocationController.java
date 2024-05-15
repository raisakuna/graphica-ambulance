package com.vastika.location.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1")
public class LocationController {

    @GetMapping(value= "/city")
    public String getCity(){
        return "The city of the user is ";
    }
}
