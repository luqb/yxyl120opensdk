package com.github.yxyl120.sdk.domain;

import com.github.yxyl120.sdk.annotation.ApiFieldProperty;

import java.io.Serializable;


public class PatientInfo implements Serializable {
    /**
     * 身份证号码
     */
    @ApiFieldProperty(value = "身份证号码", encrypted = "AES")
    private String idNumber;

    /**
     * 患者姓名
     */
    @ApiFieldProperty(value = "患者姓名", required = true)
    private String name;

    /**
     * 患者电话
     */
    @ApiFieldProperty(value = "患者电话", encrypted = "AES")
    private String mobile;

    /**
     * 患者性别 0 保密 | 1 男 | 2 女
     */
    @ApiFieldProperty(value = "患者性别 0 保密 | 1 男 | 2 女", required = true)
    private Integer sex;

    /**
     * 患者年龄
     */
    @ApiFieldProperty(value = "患者年龄")
    private Integer age;

    /**
     * 患者体重
     */
    @ApiFieldProperty("患者体重")
    private String weight;

    /**
     * 患者生日
     */
    @ApiFieldProperty(value = "患者生日。格式：yyyy-MM-dd")
    private String birthday;

    /**
     * 患者肾功能 0 异常 | 1 正常
     */
    @ApiFieldProperty(value = "患者肾功能 0 异常 | 1 正常", required = true)
    private Integer kidney;

    /**
     * 患者肝功能 0 异常 | 1 正常
     */
    @ApiFieldProperty(value = "患者肝功能 0 异常 | 1 正常", required = true)
    private Integer liver;

    /**
     * 患者是否哺乳 0 否 | 1 是
     */
    @ApiFieldProperty(value = "患者是否哺乳 0 否 | 1 是", required = true)
    private Integer lactation;

    /**
     * 过敏症描述
     */
    @ApiFieldProperty("过敏症描述")
    private String allergyDesc;

    /**
     * 现病史
     */
    @ApiFieldProperty("现病史")
    private String nowIllness;

    /**
     * 既往史
     */
    @ApiFieldProperty("既往史")
    private String historyIllness;

    /**
     * 主诉 （患者症状）
     */
    @ApiFieldProperty(value = "主诉 （患者症状）", required = true)
    private String mainSuit;

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getKidney() {
        return kidney;
    }

    public void setKidney(Integer kidney) {
        this.kidney = kidney;
    }

    public Integer getLiver() {
        return liver;
    }

    public void setLiver(Integer liver) {
        this.liver = liver;
    }

    public Integer getLactation() {
        return lactation;
    }

    public void setLactation(Integer lactation) {
        this.lactation = lactation;
    }

    public String getAllergyDesc() {
        return allergyDesc;
    }

    public void setAllergyDesc(String allergyDesc) {
        this.allergyDesc = allergyDesc;
    }

    public String getNowIllness() {
        return nowIllness;
    }

    public void setNowIllness(String nowIllness) {
        this.nowIllness = nowIllness;
    }

    public String getHistoryIllness() {
        return historyIllness;
    }

    public void setHistoryIllness(String historyIllness) {
        this.historyIllness = historyIllness;
    }

    public String getMainSuit() {
        return mainSuit;
    }

    public void setMainSuit(String mainSuit) {
        this.mainSuit = mainSuit;
    }
}
