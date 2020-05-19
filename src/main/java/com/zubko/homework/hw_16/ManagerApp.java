package com.zubko.homework.hw_16;

import java.util.HashMap;
import java.util.Map;

public class ManagerApp {
    public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<>();
        map.put("1", "2");
        map.put("2", "2");
        MyUrl url = new MyUrl.UrlBuilder()
                .withProtocol("https")
                .withDomain("google.com")
                .withPort("8800")
                .withPath("getSomeInfo")
                .withPath("getSomeInfo")
                .withParam("name", "Pete")
                .withParam("anotherSomeName")
                .withParam("surname", "Some")
                .withParam((HashMap<String, String>) map)
                .build();
        System.out.println(url.getUrl());
    }
}
