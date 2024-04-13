package com.example.holymbti_api.Service;

import com.example.holymbti_api.Repository.APIRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class APIService {
    private final APIRepository apiRepository;
    public int getResultMember(){
        Long temp = apiRepository.countBy();
        return temp.intValue();

    }
}