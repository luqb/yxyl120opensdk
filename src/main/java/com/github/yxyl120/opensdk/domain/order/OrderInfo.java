package com.github.yxyl120.opensdk.domain.order;

import com.github.yxyl120.opensdk.annotation.ApiFieldProperty;

import java.util.ArrayList;

/**
 *
 */
public class OrderInfo {
    /**
     * 药品类型：01西药 02中药
     */
    @ApiFieldProperty(notes = "药品类型：01西药 02中药", required = false)
    private String rp_type;

    /**
     * 处方单ID（唯一ID）
     */
    @ApiFieldProperty(notes = "处方单ID（唯一ID）")
    private String rp_id;

    /**
     * 门店ID
     */
    @ApiFieldProperty(notes = "门店ID")
    private String pharmacy_code;

    /**
     * 门店名称
     */
    @ApiFieldProperty(notes = "门店名称")
    private String pharmacy_name;

    /**
     * 病情描述(主诉）
     */
    @ApiFieldProperty(notes = "病情描述(主诉）")
    private String chief_complaint;

    /**
     * 现病史
     */
    @ApiFieldProperty(notes = "现病史", required = false)
    private String now_illness;

    /**
     * 既往史
     */
    @ApiFieldProperty(notes = "既往史", required = false)
    private String history_illness;

    /**
     * 患者年龄
     */
    @ApiFieldProperty(notes = "患者年龄")
    private Integer patient_age;

    /**
     * 患者姓名
     */
    @ApiFieldProperty(notes = "患者姓名")
    private String patient_name;

    /**
     * 体重
     */
    @ApiFieldProperty(notes = "体重", required = false)
    private Integer weight;

    /**
     * 对应icd名称
     */
    @ApiFieldProperty(notes = "对应icd名称", required = false)
    private String icd_name;

    /**
     * 对应icd名称2
     */
    @ApiFieldProperty(notes = "对应icd名称2", required = false)
    private String icd_name2;

    /**
     * 是否有过敏史（传值：是/否）
     */
    @ApiFieldProperty(notes = "是否有过敏史（传值：是/否）")
    private String is_history_allergic;

    /**
     * 过敏史
     */
    @ApiFieldProperty(notes = "过敏史", required = false)
    private String history_allergic;

    /**
     * 肝功能是否异常（传值：是/否）
     */
    @ApiFieldProperty(notes = "肝功能是否异常（传值：是/否）")
    private String liver_unusual;

    /**
     * 肾功能是否异常（传值：是/否）
     */
    @ApiFieldProperty(notes = "肾功能是否异常（传值：是/否）")
    private String renal_unusual;

    /**
     * 是否是备孕/怀孕/哺乳期（传值：是/否）
     */
    @ApiFieldProperty(notes = "是否是备孕/怀孕/哺乳期（传值：是/否）")
    private String lactation_flag;

    /**
     * 患者手机号(通过订单号去订单中心查)
     */
    @ApiFieldProperty(notes = "患者手机号(通过订单号去订单中心查)")
    private String patient_tel;

    /**
     * 患者性别(传数字，1男
     */
    @ApiFieldProperty(notes = "患者性别(传数字，1男,2女)")
    private String patient_gender;

    /**
     * 复诊凭证
     */
    @ApiFieldProperty(notes = "复诊凭证链接数组", required = false)
    private ArrayList<String> record_pic;

    /**
     * 处方开具时间（来互联网医院开方的时间）
     */
    @ApiFieldProperty(notes = "处方开具时间（来互联网医院开方的时间）")
    private String rp_create_time;

    /**
     * 处方文件格式(传值：png/jpg)
     */
    @ApiFieldProperty(notes = "处方文件格式(传值：png/jpg)")
    private String rp_url_type;

    /**
     * 药师ID
     */
    @ApiFieldProperty(notes = "药师ID", required = false)
    private String pharmacist_id;

    /**
     * 药师名称
     */
    @ApiFieldProperty(notes = "药师名称", required = false)
    private String pharmacist_name;

    /**
     * 药师签名地址
     */
    @ApiFieldProperty(notes = "药师签名地址", required = false)
    private String pharmacist_autograph;

    /**
     * 发药药师ID
     */
    @ApiFieldProperty(notes = "发药药师ID", required = false)
    private String dispensing_pharmacist_id;

    /**
     * 发药药师名称
     */
    @ApiFieldProperty(notes = "发药药师名称", required = false)
    private String dispensing_pharmacist_name;

    /**
     * 发药药师签名地址
     */
    @ApiFieldProperty(notes = "发药药师签名地址", required = false)
    private String dispensing_pharmacist_autograph;

    /**
     * 配药药师ID
     */
    @ApiFieldProperty(notes = "配药药师ID", required = false)
    private String deployment_pharmacist_id;

    /**
     * 配药药师名称
     */
    @ApiFieldProperty(notes = "配药药师名称", required = false)
    private String deployment_pharmacist_name;

    /**
     * 配药药师签名地址
     */
    @ApiFieldProperty(notes = "配药药师签名地址", required = false)
    private String deployment_pharmacist_autograph;

    /**
     * 是否提供药师审核，0-不使用一线平台的药师审核，1-使用一线平台的药师审核
     */
    @ApiFieldProperty(notes = "是否提供药师审核，0-不使用一线平台的药师审核，1-使用一线平台的药师审核", required = false)
    private Integer is_pharmacist_audit;

    /**
     * 回调地址，如果填写，审核完处方后自动回调到第三方药房服务接口，参考3.1.4
     */
    @ApiFieldProperty(notes = "回调地址，如果填写，审核完处方后自动回调到第三方药房服务接口，参考3.1.4", required = false)
    private String callback_url;

    /**
     * 订单药品列表
     */
    @ApiFieldProperty(notes = "订单药品列表", multipartField = true)
    private ArrayList<DrugInfo> drug_list;

    public String getRp_type() {
        return rp_type;
    }

    public void setRp_type(String rp_type) {
        this.rp_type = rp_type;
    }

    public String getRp_id() {
        return rp_id;
    }

    public void setRp_id(String rp_id) {
        this.rp_id = rp_id;
    }

    public String getPharmacy_code() {
        return pharmacy_code;
    }

    public void setPharmacy_code(String pharmacy_code) {
        this.pharmacy_code = pharmacy_code;
    }

    public String getPharmacy_name() {
        return pharmacy_name;
    }

    public void setPharmacy_name(String pharmacy_name) {
        this.pharmacy_name = pharmacy_name;
    }

    public String getChief_complaint() {
        return chief_complaint;
    }

    public void setChief_complaint(String chief_complaint) {
        this.chief_complaint = chief_complaint;
    }

    public String getNow_illness() {
        return now_illness;
    }

    public void setNow_illness(String now_illness) {
        this.now_illness = now_illness;
    }

    public String getHistory_illness() {
        return history_illness;
    }

    public void setHistory_illness(String history_illness) {
        this.history_illness = history_illness;
    }

    public Integer getPatient_age() {
        return patient_age;
    }

    public void setPatient_age(Integer patient_age) {
        this.patient_age = patient_age;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getIcd_name() {
        return icd_name;
    }

    public void setIcd_name(String icd_name) {
        this.icd_name = icd_name;
    }

    public String getIcd_name2() {
        return icd_name2;
    }

    public void setIcd_name2(String icd_name2) {
        this.icd_name2 = icd_name2;
    }

    public String getIs_history_allergic() {
        return is_history_allergic;
    }

    public void setIs_history_allergic(String is_history_allergic) {
        this.is_history_allergic = is_history_allergic;
    }

    public String getHistory_allergic() {
        return history_allergic;
    }

    public void setHistory_allergic(String history_allergic) {
        this.history_allergic = history_allergic;
    }

    public String getLiver_unusual() {
        return liver_unusual;
    }

    public void setLiver_unusual(String liver_unusual) {
        this.liver_unusual = liver_unusual;
    }

    public String getRenal_unusual() {
        return renal_unusual;
    }

    public void setRenal_unusual(String renal_unusual) {
        this.renal_unusual = renal_unusual;
    }

    public String getLactation_flag() {
        return lactation_flag;
    }

    public void setLactation_flag(String lactation_flag) {
        this.lactation_flag = lactation_flag;
    }

    public String getPatient_tel() {
        return patient_tel;
    }

    public void setPatient_tel(String patient_tel) {
        this.patient_tel = patient_tel;
    }

    public String getPatient_gender() {
        return patient_gender;
    }

    public void setPatient_gender(String patient_gender) {
        this.patient_gender = patient_gender;
    }

    public ArrayList<String> getRecord_pic() {
        return record_pic;
    }

    public void setRecord_pic(ArrayList<String> record_pic) {
        this.record_pic = record_pic;
    }

    public String getRp_create_time() {
        return rp_create_time;
    }

    public void setRp_create_time(String rp_create_time) {
        this.rp_create_time = rp_create_time;
    }

    public String getRp_url_type() {
        return rp_url_type;
    }

    public void setRp_url_type(String rp_url_type) {
        this.rp_url_type = rp_url_type;
    }

    public String getPharmacist_id() {
        return pharmacist_id;
    }

    public void setPharmacist_id(String pharmacist_id) {
        this.pharmacist_id = pharmacist_id;
    }

    public String getPharmacist_name() {
        return pharmacist_name;
    }

    public void setPharmacist_name(String pharmacist_name) {
        this.pharmacist_name = pharmacist_name;
    }

    public String getPharmacist_autograph() {
        return pharmacist_autograph;
    }

    public void setPharmacist_autograph(String pharmacist_autograph) {
        this.pharmacist_autograph = pharmacist_autograph;
    }

    public String getDispensing_pharmacist_id() {
        return dispensing_pharmacist_id;
    }

    public void setDispensing_pharmacist_id(String dispensing_pharmacist_id) {
        this.dispensing_pharmacist_id = dispensing_pharmacist_id;
    }

    public String getDispensing_pharmacist_name() {
        return dispensing_pharmacist_name;
    }

    public void setDispensing_pharmacist_name(String dispensing_pharmacist_name) {
        this.dispensing_pharmacist_name = dispensing_pharmacist_name;
    }

    public String getDispensing_pharmacist_autograph() {
        return dispensing_pharmacist_autograph;
    }

    public void setDispensing_pharmacist_autograph(String dispensing_pharmacist_autograph) {
        this.dispensing_pharmacist_autograph = dispensing_pharmacist_autograph;
    }

    public String getDeployment_pharmacist_id() {
        return deployment_pharmacist_id;
    }

    public void setDeployment_pharmacist_id(String deployment_pharmacist_id) {
        this.deployment_pharmacist_id = deployment_pharmacist_id;
    }

    public String getDeployment_pharmacist_name() {
        return deployment_pharmacist_name;
    }

    public void setDeployment_pharmacist_name(String deployment_pharmacist_name) {
        this.deployment_pharmacist_name = deployment_pharmacist_name;
    }

    public String getDeployment_pharmacist_autograph() {
        return deployment_pharmacist_autograph;
    }

    public void setDeployment_pharmacist_autograph(String deployment_pharmacist_autograph) {
        this.deployment_pharmacist_autograph = deployment_pharmacist_autograph;
    }

    public Integer getIs_pharmacist_audit() {
        return is_pharmacist_audit;
    }

    public void setIs_pharmacist_audit(Integer is_pharmacist_audit) {
        this.is_pharmacist_audit = is_pharmacist_audit;
    }

    public String getCallback_url() {
        return callback_url;
    }

    public void setCallback_url(String callback_url) {
        this.callback_url = callback_url;
    }

    public ArrayList<DrugInfo> getDrug_list() {
        return drug_list;
    }

    public void setDrug_list(ArrayList<DrugInfo> drug_list) {
        this.drug_list = drug_list;
    }
}
