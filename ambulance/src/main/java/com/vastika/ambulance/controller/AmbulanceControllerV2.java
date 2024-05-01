package com.vastika.ambulance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/api/v1")
public class AmbulanceControllerV2 {

    @GetMapping(value ="/create")
    public String handleCreateRequest(){
        return "updating create v2.";

    }

    @GetMapping(value ="/update")
    public String handleUpdateRequest(){
        return "update request v2";

    }

    @GetMapping(value ="/delete")
    public String handleDeleteRequest(){
        return "delete Request v2";

    }

    //baseurl/api/v1/

}
