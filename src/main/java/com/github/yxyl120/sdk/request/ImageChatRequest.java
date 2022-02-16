package com.github.yxyl120.sdk.request;

import com.github.yxyl120.sdk.domain.Chat;
import com.github.yxyl120.sdk.response.EmptyResponse;

import java.util.Map;

/**
 * 发送图片消息到医生
 */
public class ImageChatRequest extends Chat implements YxRequest<EmptyResponse> {

    private String imgUrl;

    private Integer imgWidth;

    private Integer imgHeight;

    public ImageChatRequest(String orderSn, String imgUrl) {
        super(2,orderSn);
        this.imgUrl = imgUrl;
    }

    @Override
    public Map<String, Object> getQueryParam() {
        return null;
    }

    @Override
    public Class<EmptyResponse> getResponseClass() {
        return EmptyResponse.class;
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
