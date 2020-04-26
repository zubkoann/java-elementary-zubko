package com.zubko.homework.hw_11;

import java.util.ArrayList;
import java.util.List;

public class Url {
    private String protocol;
    private String domain;
    private String port;
    private String path;
    private List<Param> param = new ArrayList<>();

    private Url(String protocol, String domain, String port, String path, List<Param> param) {
        this.protocol = protocol;
        this.domain = domain;
        this.port = port;
        this.path = path;
        this.param = param;
    }

    private static class Param {
        private String param;
        private String value;

        private Param(String param, String value) {
            this.param = param;
            this.value = value;
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
        private String protocol;
        private String domain;
        private String port;
        private String path;
        private List<Param> param = new ArrayList<>();

        public UrlBuilder() {
        }

        public UrlBuilder setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public UrlBuilder setDomain(String domain) {
            if (this.protocol == null) throw new NullPointerException("protocol is null");
            this.domain = domain;
            return this;
        }

        public UrlBuilder setPort(String port) {
            if (this.domain == null) throw new NullPointerException("domain is null");
            this.port = port;
            return this;
        }

        public UrlBuilder setPath(String path) {
            if (this.domain == null) throw new NullPointerException("domain is null");
            this.path = path;
            return this;
        }

        public UrlBuilder setParam(String param, String value) {
            if (this.domain == null) throw new NullPointerException("domain is null");
            this.param.add(new Param(param, value));
            return this;
        }

        public Url build() {
            if (this.domain == null) throw new NullPointerException("domain is null");
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
        if (port != null) str.append(":").append(port);
        if (path != null) str.append("/").append(path);
        if (this.param.size() > 0) {
            str.append("?");
            for (Param pr : param) {
                str.append(pr.getParam()).append("=")
                        .append(pr.getValue()).append("&");
            }
        }
        return str.toString().replaceFirst("&$", "");
    }
}
