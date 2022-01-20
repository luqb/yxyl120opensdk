import com.github.yxyl120.opensdk.Utils.HttpUtils;
import com.github.yxyl120.opensdk.YxException;
import com.github.yxyl120.opensdk.domain.RequestParameter;
import com.github.yxyl120.opensdk.domain.order.OrderInfo;

public class APITest {

    public static void main(String[] args) {
        try {
            RequestParameter<OrderInfo> parameter = new RequestParameter<>();
            parameter.setAct_id("uporder");
            parameter.setManu_id("Y001");
            parameter.setApp_id("aaaab");
            parameter.setVersion(1.0);
            parameter.setData(new OrderInfo());
            OrderInfo data = parameter.getData();
            data.setIs_history_allergic("否");
            data.setPharmacy_code("0");
            data.setRp_id("dfafefawe");

            String pushOrder = HttpUtils.pushOrder("", parameter);
            System.out.println(pushOrder);
        } catch (YxException e) {
            System.out.println(e.getMessage());
        }
    }
}
