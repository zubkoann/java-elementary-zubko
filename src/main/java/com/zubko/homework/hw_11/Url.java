package com.zubko.homework.hw_11;

import java.util.ArrayList;
import java.util.List;

public class Url {
    private String protocol;
    private String domain;
    private String port;
    private String path;
    private List<Param> param;

    private Url(String protocol, String domain, String port, String path, List<Param> param) {
        this.protocol = protocol;
        this.domain = domain;
        this.port = port;
        this.path = path;
        this.param = param;
    }
//    private Url(){}


    public String getProtocol() {
        return protocol;
    }

    private static class Param {
        private String param;
        private String value;

        private Param(String param, String value) {
            this.param = param;
            this.value = value;
        }

        private Param(String param) {
            this.param = param;
        }

        public String getParam() {
            return param;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "Param{" +
                    "param='" + param + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }

    public static class UrlBuilder {
//        private Url url = new Url();

        private String protocol;
        private String domain;
        private String port;
        private String path;
        private List<Param> param = new ArrayList<>();

        public UrlBuilder setProtocol(String protocol) {
//            url.protocol = protocol;
            this.protocol = protocol;
            return this;
        }

        public UrlBuilder setDomain(String domain) {
//            url.domain = domain;
            this.domain = domain;
            return this;
        }

        public UrlBuilder setPort(String port) {
//            url.port = port;
            this.port = port;
            return this;
        }

        public UrlBuilder setPath(String path) {
//            url.path = path;
            this.path = path;
            return this;
        }

        public UrlBuilder setParam(String param) {
            this.param.add(new Param(param));
            return this;
        }

        public UrlBuilder setParam(String param, String value) {
            this.param.add(new Param(param, value));
            return this;
        }

        public Url build() {
            return new Url(protocol, domain, port, path, param);
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
        if (port.isEmpty()) str.append(":").append(port);
        if (path.isEmpty()) str.append("/").append(path);
        if (this.param.size() > 0) {
            str.append("?");
            for (Param pr : param) {
                if (pr.getValue().isEmpty()) {
                    str.append(pr.getParam()).append("&");
                } else {
                    str.append(pr.getParam()).append("=")
                            .append(pr.getValue()).append("&");
                }
            }
        }
        return str.toString().replaceFirst("&$", "");
    }
}
