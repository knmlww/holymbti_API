package com.example.holymbti_api.Domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "MBTI_BASS")
@Data
public class MBTI_BASS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long typeId;

    private String typeName;

    private String typeDtlName;

    private String typeImgUrl;

    private String typePray;

    private String typeCcmName;

    private String typeCcmSinger;

    private String typeCcmUrl;

    private String typeCcmLyric;

    private String typeThumbnailImageUrl;

    private String typeCcmImgUrl;

    private String typeDesc;
}
