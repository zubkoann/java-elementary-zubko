package com.zubko.homework.hw_16;

public class ManagerApp {
    public static void main(String[] args) throws Exception {
        MyUrl url = new MyUrl.UrlBuilder()
                .withProtocol("https")
                .withDomain("google.com")
                .withPort("8800")
                .withPath("getSomeInfo")
                .withPath("getSomeInfo")
                .withParam("name", "Pete")
                .withParam("anotherSomeName")
                .withParam("surname", "Some")
                .build();
        System.out.println(url.getUrl());
    }
}
