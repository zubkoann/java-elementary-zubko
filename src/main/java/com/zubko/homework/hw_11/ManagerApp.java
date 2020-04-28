package com.zubko.homework.hw_11;

public class ManagerApp {
    public static void main(String[] args) {
        Url url = new Url.UrlBuilder()
                .setProtocol("https")
                .setDomain("google.com")
                .setPort("8800")
                .setPath("getSomeInfo")
                .setParam("name", "Pete")
                .setParam("anotherSomeName")
                .setParam("surname", "Some")
                .build();
        System.out.println(url.getUrl());


    }
}
