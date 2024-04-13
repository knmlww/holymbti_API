package com.example.holymbti_api.Controller;


import com.example.holymbti_api.Domain.MBTI;
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

    @PostMapping(value="/holymbti/insertResult")
    public MBTI insertResult(@RequestBody MBTI paramMBTI){
        System.out.println(paramMBTI.getJResult());
        return apiService.insertResult(paramMBTI);
    }

    @PostMapping(value="/holymbti/findMyMBTICount")
    public int findMyMBTICount(@RequestBody MBTI paramMBTI){
        return apiService.findMyMBTICount(paramMBTI);
    }
}
