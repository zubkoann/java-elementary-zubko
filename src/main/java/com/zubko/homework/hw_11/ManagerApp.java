package com.zubko.homework.hw_11;

public class ManagerApp {
    public static void main(String[] args) throws Exception {
        MyUrl url = new MyUrl.UrlBuilder()
                .setProtocol("https")
                .setDomain("google.com")
                .setPort("8800")
                .setPath("getSomeInfo")
                .setPath("getSomeInfo")
                .setParam("name", "Pete")
                .setParam("anotherSomeName")
                .setParam("surname", "Some")
                .build();
        System.out.println(url.getUrl());
        System.out.println(url.getProtocol());


    }
}
