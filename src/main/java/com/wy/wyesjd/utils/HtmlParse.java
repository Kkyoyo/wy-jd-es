package com.wy.wyesjd.utils;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @Author: Kyokyo
 * @Date: 2020-12-11
 */
public class HtmlParse {

    /**
     * 输入一个网址返回这个网址的字符串
     */
    public static String getHtml(String str) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        // 创建httpclient实例
        HttpGet httpget = new HttpGet(str);
        // 创建httpget实例
        CloseableHttpResponse response = httpclient.execute(httpget);
        // 执行get请求
        HttpEntity entity = response.getEntity();
        // 获取返回实体
        String content = EntityUtils.toString(entity, "utf-8");
        response.close(); // 关闭流和释放系统资源
        return content;

    }
}