package com.github.yxyl120.sdk.request;

import com.github.yxyl120.sdk.annotation.ApiFieldProperty;
import com.github.yxyl120.sdk.annotation.Valid;
import com.github.yxyl120.sdk.domain.order.DrugInfo;
import com.github.yxyl120.sdk.domain.order.PatientInfo;
import com.github.yxyl120.sdk.response.PushOrderResponse;

import java.util.Date;
import java.util.List;

public class PushOrderRequest extends AbsRequest implements YxRequest<PushOrderResponse>{
    /**
     * 合作方订单id
     */
    @ApiFieldProperty(value = "合作方订单id", required = true)
    private String orderIdThird;

    /**
     * 合作方问诊单号
     */
    @ApiFieldProperty(value = "合作方问诊单号", required = true)
    private String diagnosisSnThird;

    /**
     * 处方类型 1 图文 | 2 视频
     */
    @ApiFieldProperty(value = "处方类型 1 图文 | 2 视频", required = true)
    private Integer type;

    /**
     * 付费类型 0 自费 1 公费 2 医保 3 其他
     */
    @ApiFieldProperty(value = "付费类型 0 自费 1 公费 2 医保 3 其他,默认为自费")
    private Integer paymentType;

    /**
     * 付费金额
     */
    @ApiFieldProperty("付费金额")
    private Float paymentAmount;

    /**
     * 处方药类型(01西药、02中药)
     */
    @ApiFieldProperty(value = "处方药类型(01西药、02中药)", required = true)
    private String rpType;

    /**
     * 患者详情
     */
    @Valid
    @ApiFieldProperty(value = "患者详情", required = true)
    private PatientInfo patientInfo;

    /**
     * 药品列表
     */
    @Valid
    @ApiFieldProperty(value = "药品列表", required = true)
    private List<DrugInfo> drugList;

    /**
     * 药店ID
     */
    @ApiFieldProperty("药店ID")
    private String storeIdThird;

    /**
     * 药店名称
     */
    @ApiFieldProperty("药店名称")
    private String storeName;

    /**
     * 诊断
     */
    @ApiFieldProperty("诊断")
    private List<String> diagnosis;

    /**
     * 凭证图片 URL json格式 ["1.jpg", "2.jpg"]
     */
    @ApiFieldProperty("凭证图片 URL Array格式 [\"1.jpg\", \"2.jpg\"]")
    private List<String> voucherImg;

    /**
     * 是否CA签名 0 否 | 1 是
     */
    @ApiFieldProperty("是否需要CA电子签名pdf文件，此功能需要药店相关的药师先进行电子签章注册并授权")
    private String signPDF;

    /**
     * 创建时间
     */
    @ApiFieldProperty(value = "合作方订单创建时间", required = true)
    private Date createTime;
    
    @Override
    public String getApi() {
        return "/api/open/receiveOrder";
    }


    @Override
    public Class<PushOrderResponse> getResponseClass() {
        return PushOrderResponse.class;
    }

    public String getOrderIdThird() {
        return orderIdThird;
    }

    public void setOrderIdThird(String orderIdThird) {
        this.orderIdThird = orderIdThird;
    }

    public String getDiagnosisSnThird() {
        return diagnosisSnThird;
    }

    public void setDiagnosisSnThird(String diagnosisSnThird) {
        this.diagnosisSnThird = diagnosisSnThird;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Float getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Float paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getRpType() {
        return rpType;
    }

    public void setRpType(String rpType) {
        this.rpType = rpType;
    }

    public PatientInfo getPatientInfo() {
        return patientInfo;
    }

    public void setPatientInfo(PatientInfo patientInfo) {
        this.patientInfo = patientInfo;
    }

    public List<DrugInfo> getDrugList() {
        return drugList;
    }

    public void setDrugList(List<DrugInfo> drugList) {
        this.drugList = drugList;
    }

    public String getStoreIdThird() {
        return storeIdThird;
    }

    public void setStoreIdThird(String storeIdThird) {
        this.storeIdThird = storeIdThird;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<String> getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(List<String> diagnosis) {
        this.diagnosis = diagnosis;
    }

    public List<String> getVoucherImg() {
        return voucherImg;
    }

    public void setVoucherImg(List<String> voucherImg) {
        this.voucherImg = voucherImg;
    }

    public String getSignPDF() {
        return signPDF;
    }

    public void setSignPDF(String signPDF) {
        this.signPDF = signPDF;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
