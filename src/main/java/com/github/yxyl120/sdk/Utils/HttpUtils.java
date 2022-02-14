package com.github.yxyl120.sdk.Utils;

import com.github.yxyl120.sdk.YxException;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

public class HttpUtils {

    private static final Charset CHARSET = Charset.forName("UTF-8");


    /**
     * 请求一线api专用post请求
     *
     * @param api     接口请求url
     * @param jsonStr 提交的参数转换后json字符串
     * @return 请求结果
     * @throws Exception -
     */
    public static String post(String api, String jsonStr) throws YxException {
        System.out.println(api);
        System.out.println(jsonStr);
        StringBuilder result = new StringBuilder();
        DataOutputStream out = null;
        BufferedReader bufferedReader = null;
        try {
            URL url = new URL(api);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Connection", "Keep-Alive");
            connection.setUseCaches(false);
            connection.setDoOutput(true);
            connection.setDoInput(true);

            // 得到请求的输出流对象
            out = new DataOutputStream(connection.getOutputStream());
            out.write(jsonStr.getBytes(CHARSET));
            out.flush();
            out.close();
            // 建立实际的连接
            connection.connect();
            // 定义 BufferedReader输入流来读取URL的响应
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream(), CHARSET));
            String getLine;
            while ((getLine = bufferedReader.readLine()) != null) {
                result.append(getLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new YxException("请求接口" + api + "发生错误", e,400);
        } finally {
            close(out);
            close(bufferedReader);
        }
        return result.toString();
    }


    private static void close(Closeable closeable) {
        try {
            if (closeable == null) {
                return;
            }
            closeable.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
