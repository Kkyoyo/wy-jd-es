package com.wy.wyesjd;

import lombok.extern.java.Log;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static com.wy.wyesjd.utils.HtmlParse.getHtml;

@SpringBootTest
@Log
class WyEsJdApplicationTests {

    @Test
    void contextLoads() throws IOException {
        Document doc = Jsoup.parse(getHtml("http://www.ctrip.com/")); // 解析网页 得到文档对象
        Elements elements = doc.getElementsByTag("title"); // 获取tag是title的所有DOM元素
        Element element = elements.get(0); // 获取第1个元素
        String title = element.text(); // 返回元素的文本
        System.out.println("网页标题：" + title);
        Elements element1 = doc.getElementsByClass("product-item product-item_complex");
        for (Element e : element1){
            log.info(e.tagName("href").text());
        }


    }

}
