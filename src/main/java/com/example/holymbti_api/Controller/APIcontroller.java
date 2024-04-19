package com.example.holymbti_api.Controller;


import com.example.holymbti_api.Domain.MBTI;
import com.example.holymbti_api.Domain.MBTIDTO;
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
        return apiService.insertResult(paramMBTI);
    }

    @PostMapping(value="/holymbti/findMyMBTICount")
    public int findMyMBTICount(@RequestBody MBTIDTO paramMBTI){
        return apiService.findMyMBTICount(paramMBTI);
    }

    @GetMapping(value="/searchResult")
    public MBTIDTO searchResult(int search){
        int issueNum = search;
        MBTIDTO result = apiService.selectMBTI(issueNum);
        int mbtiCnt = apiService.findMyMBTICount(result);

        result.setMbtiCount(mbtiCnt);
        return result;
    }
}
