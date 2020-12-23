package com.wy.wyesjd;

import com.wy.wyesjd.oj.mengniangbaike;
import lombok.extern.java.Log;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.wy.wyesjd.parse.mengNiangBaiKeJsoup.randomPares;
import static com.wy.wyesjd.utils.HtmlParse.getHtml;

@SpringBootTest
@Log
class WyEsJdApplicationTests {

    @Test
    void contextLoads() throws IOException, InterruptedException {

        List<mengniangbaike> mengniangbaikeList = new ArrayList<>();
        for (int i = 0 ; i< 10 ;i++){
            Thread.sleep(1000);
            mengniangbaikeList.add(randomPares());
        }
        System.out.println(mengniangbaikeList.toArray().length);



    }

}
