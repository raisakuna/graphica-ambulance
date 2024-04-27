package com.vastika.ambulance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/api/v1")
public class AmbulanceController {
    /**
     * Different HTTP methods
     * 1. GET -
     * 2. POST -
     * 3. PATCH -
     * 4. PUT -
     * 5. DELETE -
     */

    @GetMapping(value ="/create")
    public String handleCreateRequest(){
        return "this is a create request";

    }

    @GetMapping(value ="/update")
    public String handleUpdateRequest(){
        return "this is a update request";

    }

    @GetMapping(value ="/delete")
    public String handleDeleteRequest(){
        return "this is a delete Request";

    }

    //baseurl/api/v1/

}
