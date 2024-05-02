package com.example.holymbti_api.Domain;

import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MBTIDTO {

    private long issueId;

    private int issueNum;

    private String mbtiResult;

    private int iResult;

    private int eResult;

    private int nResult;

    private int sResult;

    private int tResult;

    private int fResult;

    private int jResult;

    private int pResult;

    private String imgName;

    private Date regDt;

    private int mbtiCount;

    private long typeId;

    private String typeName;

    private String typeDtlName;

    private String typeImgUrl;

    private String typePray;

    private String typeCcmName;

    private String typeCcmSinger;

    private String typeCcmUrl;

    private String typeCcmLyric;

    private String typeCcmImgUrl;

    private String typeThumbnailImageUrl;

    public long getIssueId() {
        return issueId;
    }

    public void setIssueId(long issueId) {
        this.issueId = issueId;
    }

    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    public String getMbtiResult() {
        return mbtiResult;
    }

    public void setMbtiResult(String mbtiResult) {
        this.mbtiResult = mbtiResult;
    }

    public int getiResult() {
        return iResult;
    }

    public void setiResult(int iResult) {
        this.iResult = iResult;
    }

    public int geteResult() {
        return eResult;
    }

    public void seteResult(int eResult) {
        this.eResult = eResult;
    }

    public int getnResult() {
        return nResult;
    }

    public void setnResult(int nResult) {
        this.nResult = nResult;
    }

    public int getsResult() {
        return sResult;
    }

    public void setsResult(int sResult) {
        this.sResult = sResult;
    }

    public int gettResult() {
        return tResult;
    }

    public void settResult(int tResult) {
        this.tResult = tResult;
    }

    public int getfResult() {
        return fResult;
    }

    public void setfResult(int fResult) {
        this.fResult = fResult;
    }

    public int getjResult() {
        return jResult;
    }

    public void setjResult(int jResult) {
        this.jResult = jResult;
    }

    public int getpResult() {
        return pResult;
    }

    public void setpResult(int pResult) {
        this.pResult = pResult;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public Date getRegDt() {
        return regDt;
    }

    public void setRegDt(Date regDt) {
        this.regDt = regDt;
    }

    public int getMbtiCount() {
        return mbtiCount;
    }

    public void setMbtiCount(int mbtiCount) {
        this.mbtiCount = mbtiCount;
    }

    public String getTypeCcmName() {
        return typeCcmName;
    }

    public void setTypeCcmName(String typeCcmName) {
        this.typeCcmName = typeCcmName;
    }

    public String getTypeCcmSinger() {
        return typeCcmSinger;
    }

    public void setTypeCcmSinger(String typeCcmSinger) {
        this.typeCcmSinger = typeCcmSinger;
    }

    public String getTypeCcmUrl() {
        return typeCcmUrl;
    }

    public void setTypeCcmUrl(String typeCcmUrl) {
        this.typeCcmUrl = typeCcmUrl;
    }

    public String getTypeCcmLyric() {
        return typeCcmLyric;
    }

    public void setTypeCcmLyric(String typeCcmLyric) {
        this.typeCcmLyric = typeCcmLyric;
    }

    public String getTypePray() {
        return typePray;
    }

    public void setTypePray(String typePray) {
        this.typePray = typePray;
    }

    public long getTypeId() {
        return typeId;
    }

    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeDtlName() {
        return typeDtlName;
    }

    public void setTypeDtlName(String typeDtlName) {
        this.typeDtlName = typeDtlName;
    }

    public String getTypeImgUrl() {
        return typeImgUrl;
    }

    public void setTypeImgUrl(String typeImgUrl) {
        this.typeImgUrl = typeImgUrl;
    }

    public String getTypeCcmImgUrl() {
        return typeCcmImgUrl;
    }

    public void setTypeCcmImgUrl(String typeCcmImgUrl) {
        this.typeCcmImgUrl = typeCcmImgUrl;
    }

    public String getTypeThumbnailImage() {
        return typeThumbnailImageUrl;
    }

    public void setTypeThumbnailImage(String typeThumbnailImageUrl) {
        this.typeThumbnailImageUrl = typeThumbnailImageUrl;
    }
}
