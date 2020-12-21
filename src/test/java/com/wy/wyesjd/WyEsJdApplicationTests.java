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

//        Document doc = Jsoup.parse(getHtml("https://zh.moegirl.org.cn/Special:%E9%9A%8F%E6%9C%BA%E9%A1%B5%E9%9D%A2")); // 解析网页 得到文档对象
        Document doc = Jsoup.parse(getHtml("https://zh.moegirl.org.cn/%E6%B3%B0%E5%9D%A6%E6%9C%BA%E7%94%B2")); // 解析网页 得到文档对象
        Elements elements = doc.getElementsByTag("title"); // 获取tag是title的所有DOM元素
        Element element = elements.get(0); // 获取第1个元素
        String title = element.text(); // 返回元素的文本
        String text = doc.html();
        Elements items = doc.getElementsByClass("firstHeading");
        String item = items.get(0).text();
        Element toc = doc.getElementsByClass("mw-parser-output").get(1);

        System.out.println("网页标题：" + title);
        System.out.println("词条:"+ item);
        System.out.println("html:"+ toc.text());



    }

}
