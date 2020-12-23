package com.wy.wyesjd.parse;

import com.wy.wyesjd.oj.mengniangbaike;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import static com.wy.wyesjd.utils.HtmlParse.getHtml;

/**
 * @Author: Kyokyo
 * @Date: 2020-12-22
 */
public  class mengNiangBaiKeJsoup {
    public static mengniangbaike randomPares() throws IOException {
        Document doc = Jsoup.parse(getHtml("https://zh.moegirl.org.cn/Special:%E9%9A%8F%E6%9C%BA%E9%A1%B5%E9%9D%A2"));
        // 解析网页 得到文档对象
        Elements items = doc.getElementsByClass("firstHeading");
        String item = items.get(0).text();
        Elements tocs = doc.getElementsByClass("mw-parser-output");
        Elements tocp = tocs.get(1).getElementsByTag("p");
        String  tocpb = tocp.tagName("b").text();

        mengniangbaike citiao = new mengniangbaike();
        citiao.setItemName(item);
        citiao.setItemBrief(tocpb);
        return citiao;
    }

    public static mengniangbaike pares(String html) throws IOException {
        Document doc = Jsoup.parse(getHtml(html));
        // 解析网页 得到文档对象
        Elements items = doc.getElementsByClass("firstHeading");
        String item = items.get(0).text();
        Elements tocs = doc.getElementsByClass("mw-parser-output");
        Elements tocp = tocs.get(1).getElementsByTag("p");
        String  tocpb = tocp.tagName("b").text();

        mengniangbaike citiao = new mengniangbaike();
        citiao.setItemName(item);
        citiao.setItemBrief(tocpb);
        return citiao;
    }

}
