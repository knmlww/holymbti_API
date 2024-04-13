package com.example.holymbti_api.Controller;


import com.example.holymbti_api.Service.APIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




@RestController
public class APIcontroller {

    @Autowired
    APIService apiService;



    @PostMapping(value="/holymbti/test")
    public String getTestValue(){
        return "SERVER OK";
    }

    @PostMapping(value="/holymbti/getResultMember")
    public int getResultMember(){
        return apiService.getResultMember();
    }
}
