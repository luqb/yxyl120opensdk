package com.github.yxyl120.sdk.domain;

import com.github.yxyl120.sdk.annotation.ApiFieldProperty;

import java.io.Serializable;

public class DrugInfo implements Serializable{

    @ApiFieldProperty(value = "合作方药品id", required = true)
    private Serializable drugIdThird;

    @ApiFieldProperty(value = "药品通用名称", required = true)
    private String drugNameComm;

    @ApiFieldProperty(value = "药品规格", required = true)
    private String drugSpecification;

    @ApiFieldProperty(value = "药品数量", required = true)
    private Integer saleAmount;

    @ApiFieldProperty(value = "包装单位，例：盒、瓶", required = true)
    private String saleUnit;

    @ApiFieldProperty("天数,选填")
    private Integer usageDays;

    @ApiFieldProperty("用药方法,选填")
    private String usageName;

    @ApiFieldProperty("使用频次单位,选填")
    private String freqUnit;

    @ApiFieldProperty("使用频次数量,选填")
    private String freqTimes;

    @ApiFieldProperty("使用剂量单位,选填")
    private String doseUnit;

    @ApiFieldProperty("使用剂量数量")
    private String doseNum;

    @ApiFieldProperty("说明书")
    private String instructions;

    public Serializable getDrugIdThird() {
        return drugIdThird;
    }

    public void setDrugIdThird(Serializable drugIdThird) {
        this.drugIdThird = drugIdThird;
    }

    public String getDrugNameComm() {
        return drugNameComm;
    }

    public void setDrugNameComm(String drugNameComm) {
        this.drugNameComm = drugNameComm;
    }

    public String getDrugSpecification() {
        return drugSpecification;
    }

    public void setDrugSpecification(String drugSpecification) {
        this.drugSpecification = drugSpecification;
    }

    public Integer getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(Integer saleAmount) {
        this.saleAmount = saleAmount;
    }

    public String getSaleUnit() {
        return saleUnit;
    }

    public void setSaleUnit(String saleUnit) {
        this.saleUnit = saleUnit;
    }

    public Integer getUsageDays() {
        return usageDays;
    }

    public void setUsageDays(Integer usageDays) {
        this.usageDays = usageDays;
    }

    public String getUsageName() {
        return usageName;
    }

    public void setUsageName(String usageName) {
        this.usageName = usageName;
    }

    public String getFreqUnit() {
        return freqUnit;
    }

    public void setFreqUnit(String freqUnit) {
        this.freqUnit = freqUnit;
    }

    public String getFreqTimes() {
        return freqTimes;
    }

    public void setFreqTimes(String freqTimes) {
        this.freqTimes = freqTimes;
    }

    public String getDoseUnit() {
        return doseUnit;
    }

    public void setDoseUnit(String doseUnit) {
        this.doseUnit = doseUnit;
    }

    public String getDoseNum() {
        return doseNum;
    }

    public void setDoseNum(String doseNum) {
        this.doseNum = doseNum;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
