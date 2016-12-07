package com.kaishengit.util;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * Created by sunny on 2016/12/7.
 */
public class HttpUtil {
    public static String sendHttpGetRequestWithString(String url) {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        return url;
    }
}
