package com.example.holymbti_api.Controller;


import com.example.holymbti_api.Domain.MBTI;
import com.example.holymbti_api.Domain.MBTIDTO;
import com.example.holymbti_api.Domain.MBTI_BASS;
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
        return apiService.findMyMBTICount(paramMBTI.getMbtiResult());
    }

    @GetMapping(value="/holymbti/searchResult/{search}")
    public MBTIDTO searchResult(@PathVariable("search") int search){
        MBTIDTO resultDTO = new MBTIDTO();
        int issueNum = search;

        MBTI_BASS result = apiService.selectMBTI(issueNum);

        int mbtiCnt = apiService.findMyMBTICount(result.getTypeName());

        resultDTO.setIssueNum(issueNum);
        resultDTO.setTypeName(result.getTypeName());
        resultDTO.setTypeDtlName(result.getTypeDtlName());
        resultDTO.setTypeImgUrl(result.getTypeImgUrl());
        resultDTO.setTypePray(result.getTypePray());
        resultDTO.setTypeCcmName(result.getTypeCcmName());
        resultDTO.setTypeCcmSinger(result.getTypeCcmSinger());
        resultDTO.setTypeCcmUrl(result.getTypeCcmUrl());
        resultDTO.setTypeCcmLyric(result.getTypeCcmLyric());
        resultDTO.setMbtiCount(mbtiCnt);
        resultDTO.setTypeCcmImgUrl(result.getTypeCcmImageUrl());

        return resultDTO;
    }
}
