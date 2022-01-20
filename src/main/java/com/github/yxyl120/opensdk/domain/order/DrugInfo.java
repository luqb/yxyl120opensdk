package com.github.yxyl120.opensdk.domain.order;

import com.github.yxyl120.opensdk.annotation.ApiFieldProperty;

public class DrugInfo {
    /**
     * 药品名称（通用名）
     */
    @ApiFieldProperty( notes = "药品名称（通用名）")
    private String drug_common_name;

    /**
     * 药品规格
     */
    @ApiFieldProperty( notes = "药品规格")
    private String drug_specification;

    /**
     * 使用方法
     */
    @ApiFieldProperty( notes = "使用方法", required = false)
    private String usage_method;

    /**
     * 药品频次
     */
    @ApiFieldProperty( notes = "药品频次", required = false)
    private String usage_frequency_unit;

    /**
     * 每次用药数量
     */
    @ApiFieldProperty( notes = "每次用药数量", required = false)
    private String usage_per_use_count;

    /**
     * 每次用药单位
     */
    @ApiFieldProperty( notes = "每次用药单位", required = false)
    private String usage_per_use_unit;

    /**
     * 天数
     */
    @ApiFieldProperty( notes = "天数", required = false)
    private String usage_days;

    /**
     * 药品数量
     */
    @ApiFieldProperty( notes = "药品数量")
    private String sale_amount;

    /**
     * 药品数量单位
     */
    @ApiFieldProperty( notes = "药品数量单位", required = false)
    private String sale_unit;

    /**
     * 药品说明书
     */
    @ApiFieldProperty( notes = "药品说明书", required = false)
    private String instructions;

    /**
     * 药品产品批准文号              
     */
    @ApiFieldProperty( notes = "药品产品批准文号")
    private String approval_number;

    public String getDrug_common_name() {
        return drug_common_name;
    }

    public void setDrug_common_name(String drug_common_name) {
        this.drug_common_name = drug_common_name;
    }

    public String getDrug_specification() {
        return drug_specification;
    }

    public void setDrug_specification(String drug_specification) {
        this.drug_specification = drug_specification;
    }

    public String getUsage_method() {
        return usage_method;
    }

    public void setUsage_method(String usage_method) {
        this.usage_method = usage_method;
    }

    public String getUsage_frequency_unit() {
        return usage_frequency_unit;
    }

    public void setUsage_frequency_unit(String usage_frequency_unit) {
        this.usage_frequency_unit = usage_frequency_unit;
    }

    public String getUsage_per_use_count() {
        return usage_per_use_count;
    }

    public void setUsage_per_use_count(String usage_per_use_count) {
        this.usage_per_use_count = usage_per_use_count;
    }

    public String getUsage_per_use_unit() {
        return usage_per_use_unit;
    }

    public void setUsage_per_use_unit(String usage_per_use_unit) {
        this.usage_per_use_unit = usage_per_use_unit;
    }

    public String getUsage_days() {
        return usage_days;
    }

    public void setUsage_days(String usage_days) {
        this.usage_days = usage_days;
    }

    public String getSale_amount() {
        return sale_amount;
    }

    public void setSale_amount(String sale_amount) {
        this.sale_amount = sale_amount;
    }

    public String getSale_unit() {
        return sale_unit;
    }

    public void setSale_unit(String sale_unit) {
        this.sale_unit = sale_unit;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getApproval_number() {
        return approval_number;
    }

    public void setApproval_number(String approval_number) {
        this.approval_number = approval_number;
    }
}
