package com.example.holymbti_api.Domain;




import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "mbti_issue")
@Data
public class MBTI {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long issue_id;

    private String mbti_result;

    private Date reg_dt;



}