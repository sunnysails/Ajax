package com.kaishengit;

import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunny on 2016/12/7.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        List<String> name = Arrays.asList( "jack","rose","tom" );
        String json = new Gson().toJson( name );
        System.out.println( json );

/*       //创建一个可以发送请求的客户端。
        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet("http://ww1.sinaimg.cn/mw690/824de770jw1epwcnivby6j20go0p00x4.jpg");

        HttpResponse response = httpClient.execute(httpGet);
        if (response.getStatusLine().getStatusCode() == 200) {
            InputStream inputStream = response.getEntity().getContent();

            OutputStream outputStream = new FileOutputStream("E:/123.jpg");

            IOUtils.copy(inputStream, outputStream);

            outputStream.flush();
            outputStream.close();
            inputStream.close();
        } else {
            System.out.println("服务器异常：");
        }
        httpClient.close();
*/

/*
        //创建一个可以发送请求的客户端。
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建一个Get请求方式
        HttpGet httpGet = new HttpGet("http://www.kaishengit.com");
        //发出请求并接受响应。
        HttpResponse response = httpClient.execute(httpGet);

        int statusCode = response.getStatusLine().getStatusCode();

        if (statusCode == 200) {
            //获取响应输出流
            InputStream inputStream = response.getEntity().getContent();
            String result = IOUtils.toString(inputStream, "UTF-8");

            inputStream.close();

            System.out.println(result);
        } else {
            System.out.println("服务器异常：" + statusCode);
        }
        httpClient.close();
        */
    }
}
