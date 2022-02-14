package com.github.yxyl120.sdk.domain;

public class ImageChat extends Chat {

    private String imgUrl;

    private Integer imgWidth;

    private Integer imgHeight;

    public ImageChat(String orderSn, String imgUrl) {
        this.imgUrl = imgUrl;
        this.setChatType(2);
        this.setOrderSn(orderSn);
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(Integer imgWidth) {
        this.imgWidth = imgWidth;
    }

    public Integer getImgHeight() {
        return imgHeight;
    }

    public void setImgHeight(Integer imgHeight) {
        this.imgHeight = imgHeight;
    }
}
