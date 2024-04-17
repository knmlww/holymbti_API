package com.example.holymbti_api.Domain;




import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "MBTI_ISSUE")
@Data
public class MBTI {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long issue_id;

    @Column(name = "issue_num")
    private int issueNum;

    @Column(name = "mbti_result")
    private String mbtiResult;

    @Column(name = "i_result")
    private int iResult;

    @Column(name = "e_result")
    private int eResult;

    @Column(name = "n_result")
    private int nResult;

    @Column(name = "s_result")
    private int sResult;

    @Column(name = "t_result")
    private int tResult;

    @Column(name = "f_result")
    private int fResult;

    @Column(name = "j_result")
    private int jResult;

    @Column(name = "p_result")
    private int pResult;

    @Column(name = "img_name")
    private String imgName;

    @CreationTimestamp
    @Column(name = "reg_dt")
    private Date reg_dt;



}