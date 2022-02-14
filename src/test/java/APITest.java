import com.github.yxyl120.sdk.DefaultYxClient;
import com.github.yxyl120.sdk.YxException;
import com.github.yxyl120.sdk.domain.DrugInfo;
import com.github.yxyl120.sdk.domain.PatientInfo;
import com.github.yxyl120.sdk.request.PushOrderRequest;
import com.github.yxyl120.sdk.response.PushOrderResponse;

import java.util.Collections;
import java.util.Date;

public class APITest {

    public static void main(String[] args) throws YxException {

        String serverUrl = "http://localhost:8515";
        String secret = "DB957E8E2F41AB28B65840BD47A76AF2";

        DefaultYxClient yxClient = new DefaultYxClient(serverUrl, "440004901", secret);
        PushOrderRequest orderRequest = new PushOrderRequest();

        orderRequest.setOrderIdThird("C2021232657");
        orderRequest.setDiagnosisSnThird("C2021232657");
        orderRequest.setStoreName("一线大药房");
        orderRequest.setCreateTime(new Date());
        orderRequest.setType(2);
        PatientInfo patientInfo = new PatientInfo();
        orderRequest.setPatientInfo(patientInfo);
        patientInfo.setName("张三");
        patientInfo.setAge(80);
        patientInfo.setSex(1);
        patientInfo.setKidney(0);
        patientInfo.setLiver(0);
        patientInfo.setLactation(0);
        patientInfo.setMobile("13428841594");
        patientInfo.setBirthday("2021-12-29");

        patientInfo.setMainSuit("咳嗽");
        patientInfo.setAllergyDesc("无");

        DrugInfo drugInfo = new DrugInfo();
        drugInfo.setDrugIdThird(669);
        drugInfo.setDrugNameComm("乙酰螺旋霉素片");
        drugInfo.setDrugSpecification("0.1g*12片*2板");
        drugInfo.setSaleAmount(3);
        drugInfo.setSaleUnit("盒");

        orderRequest.setDrugList(Collections.singletonList(drugInfo));
        orderRequest.setRpType("01");

        PushOrderResponse response = yxClient.execute(orderRequest);
        System.out.println(response);

    }
}
