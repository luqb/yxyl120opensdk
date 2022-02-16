package com.github.yxyl120.sdk.request;

import com.github.yxyl120.sdk.annotation.ApiFieldProperty;
import com.github.yxyl120.sdk.domain.Chat;
import com.github.yxyl120.sdk.response.EmptyResponse;

import java.util.Map;

/**
 * 媒体消息请求类
 */
public class MediaChatRequest extends Chat implements YxRequest<EmptyResponse> {

    @ApiFieldProperty(value = "媒体播放地址", required = true)
    private String mediaUrl;

    @ApiFieldProperty("媒体播放的时长,单位秒")
    private long duration;

    @ApiFieldProperty(value = "媒体类型，arm,hls,mp4等等", required = true)
    private String fileFormat;

    /**
     * 构造媒体消息请求
     *
     * @param orderSn 一线平台的订单号
     */
    public MediaChatRequest(String orderSn) {
        super(3, orderSn);
    }

    /**
     * /**
     * 构造媒体消息请求
     *
     * @param orderSn    一线平台的订单号
     * @param mediaUrl   媒体地址
     * @param duration   媒体播放的长度
     * @param fileFormat 媒体类型
     */
    public MediaChatRequest(String orderSn, String mediaUrl, long duration, String fileFormat) {
        this(orderSn);
        this.mediaUrl = mediaUrl;
        this.duration = duration;
        this.fileFormat = fileFormat;
    }

    @Override
    public Map<String, Object> getQueryParam() {
        return null;
    }

    @Override
    public Class<EmptyResponse> getResponseClass() {
        return EmptyResponse.class;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }
}
