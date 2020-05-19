package com.zubko.homework.hw_16;

import java.util.HashMap;

//Изменить поле params со String на HashMap
//        Добавить метод withParams(HashMap params), который добавляет параметры
//        Обновить уже существующие методы
//        Обновить метод билд с учетом HashMap

public class MyUrl {
    private String protocol;
    private String domain;
    private String port;
    private String path;
    private HashMap<String, String> param;

    private MyUrl(String protocol, String domain, String port, String path, HashMap<String, String> param) {
        this.protocol = protocol;
        this.domain = domain;
        this.port = port;
        this.path = path;
        this.param = param;
    }

    public static class UrlBuilder {
        private String protocol;
        private String domain;
        private String port;
        private String path;
        private HashMap<String, String> param = new HashMap<>();

        public UrlBuilder withProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public UrlBuilder withDomain(String domain) {
            this.domain = domain;
            return this;
        }

        public UrlBuilder withPort(String port) {
            this.port = port;
            return this;
        }

        public UrlBuilder withPath(String path) {
            this.path = path;
            return this;
        }

        public UrlBuilder withParam(String param) {
            this.param.put(param, null);
            return this;
        }

        public UrlBuilder withParam(String param, String value) {
            this.param.put(param, value);
            return this;
        }

        public UrlBuilder withParam(HashMap<String, String> param) {
            this.param.putAll(param);
            return this;
        }

        public MyUrl build() {
            return new MyUrl(protocol, domain, port, path, param);
        }
    }

    @Override
    public String toString() {
        return "Url{" +
                "protocol='" + protocol + '\'' +
                ", domain='" + domain + '\'' +
                ", port='" + port + '\'' +
                ", path='" + path + '\'' +
                ", param=" + param +
                '}';
    }

    public String getUrl() {
        StringBuilder str = new StringBuilder();
        str.append(protocol).append("://").append(domain);
        if (port != null) str.append(":").append(port);
        if (!path.isEmpty()) str.append("/").append(path);
        if (this.param.size() > 0) {
            str.append("?");
            for (String pr : param.keySet()) {
                if (param.get(pr) == null) {
                    str.append(pr).append("&");
                } else {
                    str.append(pr).append("=")
                            .append(param.get(pr)).append("&");
                }
            }
        }
        return str.toString().replaceFirst("&$", "");
    }
}
