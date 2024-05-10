package com.example.holymbti_api.Controller;


import com.example.holymbti_api.Domain.MBTI;
import com.example.holymbti_api.Domain.MBTIDTO;
import com.example.holymbti_api.Domain.MBTI_BASS;
import com.example.holymbti_api.Service.APIService;
import com.example.holymbti_api.Service.AwsS3Util;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@RestController
@RequiredArgsConstructor
public class APIcontroller {

    @Autowired
    APIService apiService;

    private final AwsS3Util awsS3Util;


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
        int maxIssueNum = apiService.selectMaxIssueNum();
        paramMBTI.setIssueNum(maxIssueNum+1);
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
        resultDTO.setTypeCcmImgUrl(result.getTypeCcmImgUrl());
        resultDTO.setTypeThumbnailImageUrl(result.getTypeThumbnailImageUrl());
        resultDTO.setTypeDesc(result.getTypeDesc());

        return resultDTO;
    }

    // 다운로드
    @GetMapping("/download")
    public ResponseEntity<ByteArrayResource> downloadFile(@RequestParam(value = "image") String image) {

        //  ex. image=https://board-example.s3.ap-northeast-2.amazonaws.com/2b8359b2-de59-4765-8da0-51f5d4e556c3.jpg
        image= "https://bucket-1l6y8l.s3.ap-northeast-2.amazonaws.com/ENTP1.jpg";
        byte[] data = awsS3Util.downloadFile(image);
        ByteArrayResource resource = new ByteArrayResource(data);
        return ResponseEntity
                .ok()
                .contentLength(data.length)
                .header("Content-type", "application/octet-stream")
                .header("Content-disposition", "attachment; filename=\"" + image + "\"")
                .body(resource);
    }

}
