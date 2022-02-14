package com.github.yxyl120.sdk.request;

import com.github.yxyl120.sdk.annotation.ApiFieldProperty;
import com.github.yxyl120.sdk.response.SyncPharmacistResponse;

/**
 * 同步药师到一线
 */
public class SyncPharmacistInfoRequest extends AbsRequest implements YxRequest<SyncPharmacistResponse> {

    /**
     * 合作方的药师id
     */
    @ApiFieldProperty(value = "合作方的药师id", required = true)
    private String pharmacistId;

    @ApiFieldProperty(value = "药师真实姓名", required = true)
    private String pharmacistName;

    @ApiFieldProperty(value = "药师头像", required = true)
    private String avatar;

    @ApiFieldProperty(value = "药师手机号", required = true, encrypted = "AES")
    private String mobile;

    @ApiFieldProperty(value = "药师身份证号码", required = true, encrypted = "AES")
    private String idNumber;

    @ApiFieldProperty(value = "药师身份证头像面图片url", required = true)
    private String idFrontImg;

    @ApiFieldProperty(value = "药师身份证国徽面图片url", required = true)
    private String idEmblemImg;

    @ApiFieldProperty(value = "药师执业证", required = true)
    private String practitionerCertificateImg;

    @ApiFieldProperty(value = "药师药师资格证")
    private String certificateImg;

    @ApiFieldProperty(value = "药师性别", required = true)
    private Integer sex;

    @ApiFieldProperty(value = "药师简介")
    private String introduction;

    @ApiFieldProperty(value = "药师角色:1 审核药师 2 发药药师 3 配药药师,4 审核药师+配药药师", required = true)
    private Integer role;


    @Override
    public String getApi() {
        return "/api/open/syncPharmacist";
    }

    @Override
    public Class<SyncPharmacistResponse> getResponseClass() {
        return SyncPharmacistResponse.class;
    }


    public String getPharmacistId() {
        return pharmacistId;
    }

    public void setPharmacistId(String pharmacistId) {
        this.pharmacistId = pharmacistId;
    }

    public String getPharmacistName() {
        return pharmacistName;
    }

    public void setPharmacistName(String pharmacistName) {
        this.pharmacistName = pharmacistName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdFrontImg() {
        return idFrontImg;
    }

    public void setIdFrontImg(String idFrontImg) {
        this.idFrontImg = idFrontImg;
    }

    public String getIdEmblemImg() {
        return idEmblemImg;
    }

    public void setIdEmblemImg(String idEmblemImg) {
        this.idEmblemImg = idEmblemImg;
    }

    public String getPractitionerCertificateImg() {
        return practitionerCertificateImg;
    }

    public void setPractitionerCertificateImg(String practitionerCertificateImg) {
        this.practitionerCertificateImg = practitionerCertificateImg;
    }

    public String getCertificateImg() {
        return certificateImg;
    }

    public void setCertificateImg(String certificateImg) {
        this.certificateImg = certificateImg;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}
