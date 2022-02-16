package com.yxyl120;

import com.github.yxyl120.sdk.DefaultYxClient;
import com.github.yxyl120.sdk.YxClient;
import com.github.yxyl120.sdk.YxException;
import com.github.yxyl120.sdk.domain.DrugInfo;
import com.github.yxyl120.sdk.domain.PatientInfo;
import com.github.yxyl120.sdk.domain.RoomInfo;
import com.github.yxyl120.sdk.request.*;
import com.github.yxyl120.sdk.response.ChatResponse;
import com.github.yxyl120.sdk.response.EmptyResponse;
import com.github.yxyl120.sdk.response.PushOrderResponse;
import com.github.yxyl120.sdk.response.SyncPharmacistResponse;

import java.util.Collections;
import java.util.Date;

public class APITest {

    private YxClient yxClient;

    public APITest() {
        String serverUrl = "http://localhost:8515";
        String appId = "440004901";
        String secret = "DB957E8E2F41AB28B65840BD47A76AF2";
        yxClient = new DefaultYxClient(serverUrl, appId, secret);
    }

    public static void main(String[] args) throws YxException {
        new APITest().syncPharmacistInfoTest();
    }

    /**
     * 推送一张视频单或图文单
     */
    private void pushOrderTest() {
        PushOrderRequest orderRequest = new PushOrderRequest();

        orderRequest.setOrderIdThird("C2021232657");
        orderRequest.setDiagnosisSnThird("C2021232657");
        orderRequest.setStoreName("一线大药房");
        orderRequest.setCreateTime(new Date());
        // 1图文 2为视频
        orderRequest.setType(2);

        PatientInfo patientInfo = new PatientInfo();
        orderRequest.setPatientInfo(patientInfo);
        patientInfo.setName("张三");
        patientInfo.setAge(1);
        patientInfo.setSex(1);
        patientInfo.setKidney(0);
        patientInfo.setLiver(0);
        patientInfo.setLactation(0);
        patientInfo.setMobile("13428841594");
        patientInfo.setBirthday("2021-12-29");

        patientInfo.setMainSuit("咳嗽");
        patientInfo.setAllergyDesc("");

        DrugInfo drugInfo = new DrugInfo();
        drugInfo.setDrugIdThird(669);
        drugInfo.setDrugNameComm("乙酰螺旋霉素片");
        drugInfo.setDrugSpecification("0.1g*12片*2板");
        drugInfo.setSaleAmount(3);
        drugInfo.setSaleUnit("盒");
        drugInfo.setInstructions("药品说明书");

        orderRequest.setDrugList(Collections.singletonList(drugInfo));
        orderRequest.setRpType("01");
        //------- 指定处方药师部分（可选） -----
        orderRequest.setPharmacistModel(1);
        orderRequest.setPharmacistId(20);
        orderRequest.setDeploymentPharmacistId(28);
        orderRequest.setDispensingPharmacistId(383);
        //------- 指定药师部分结束-----

        PushOrderResponse response = yxClient.execute(orderRequest);
        System.out.println(response);
        // 房间进行视频通话的相关的信息
        RoomInfo data = response.getData();
    }

    /**
     * 根据处方号发送文本消息
     */
    private void sendTextMsg() {
        TextChatRequest request = new TextChatRequest("C2201121686180076", "医生你好");
        ChatResponse response = yxClient.execute(request);
        // 后续需要合作方的接口等待接收回调
    }

    /**
     * 根据处方号发送图片消息
     */
    private void sendImageMsg() {
        ImageChatRequest request = new ImageChatRequest("C2201121686180076",
                "https://asset.nxk520.com/abc.png");
        request.setImgWidth(60);
        request.setImgHeight(110);
        ChatResponse response = yxClient.execute(request);
        // 后续需要合作方的接口等待接收回调
    }

    /**
     * 根据处方号发起视频聊天
     */
    private void sendLiveMsg() {
        LiveChatRequest request = new LiveChatRequest("C2201121686180076");
        ChatResponse response = yxClient.execute(request);
        // 后续需要合作方的接口等待接收回调
    }

    private void sendMediaChatRequest(){
        MediaChatRequest request = new MediaChatRequest("C2201121686180076");
        request.setDuration(20);
        request.setMediaUrl("https://asset.nxk520.com/test.mp4");
        request.setFileFormat("mp4");
        ChatResponse response = yxClient.execute(request);
    }

    /**
     * 同步药师资料到一线
     */
    private void syncPharmacistInfoTest() {
        SyncPharmacistInfoRequest request = new SyncPharmacistInfoRequest();
        request.setPharmacistId(764);
        request.setPharmacistName("张三");
        request.setSex(1);
        request.setRole(2);
        request.setMobile("16666666666");
        request.setIdNumber("632323190605260586");
        request.setAvatar("https://asset.nxk520.com/abc.png");
        request.setIdFrontImg("https://asset.nxk520.com/abc.png");
        request.setIdEmblemImg("https://asset.nxk520.com/abc.png");
        request.setCertificateImg("https://asset.nxk520.com/abc.png");
        request.setPractitionerCertificateImg("https://asset.nxk520.com/abc.png");
        request.setSignatureImg("https://asset.nxk520.com/abc.png");
        request.setIntroduction("药师简介……");
        SyncPharmacistResponse response = yxClient.execute(request);
    }

    /**
     * 注销药师，或启用药师
     */
    private void SyncPharmacistStatusTest(){

//        SyncPharmacistStatusRequest request = new SyncPharmacistStatusRequest();
//        request.setPharmacistId(764);
//        request.setStatus(0);
        SyncPharmacistStatusRequest request = new SyncPharmacistStatusRequest(764,0);
        SyncPharmacistResponse response = yxClient.execute(request);
    }


}
