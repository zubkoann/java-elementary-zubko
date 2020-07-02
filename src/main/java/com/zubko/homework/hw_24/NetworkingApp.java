package com.zubko.homework.hw_24;

import com.squareup.okhttp.*;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkingApp {
    public static String serviceUrl = "https://simplae-app-course.herokuapp.com/users";

    public static void main(String[] args) throws Exception {

//        buildMethod();
//        apache();
//        okPostRequest();
        okGetRequest();
    }

    public static void okGetRequest() throws Exception {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .header("Accept", "application/json")
//                .delete()
                .url(serviceUrl)
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.body().string());
    }

    public static void okPostRequest() throws Exception {
        OkHttpClient client = new OkHttpClient();

        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        String content = "{\"id\": \"1111-22-3333-444-5555\",\"email\": \"email@gmail.com\", \"password\": \"1234\"}";
        Request request = new Request.Builder()
                .header("Accept", "application/json")
                .post(RequestBody.create(JSON, content))
                .url(serviceUrl)
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.body().string());
    }

    public static void apache() throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet(serviceUrl);
        request.addHeader(HttpHeaders.ACCEPT, "application/json");
        CloseableHttpResponse response = httpClient.execute(request);
        System.out.println(response.getStatusLine().getStatusCode());
        System.out.println(response.getStatusLine().getReasonPhrase());

        HttpEntity entity = response.getEntity();
        System.out.println(entity);

        BufferedReader br = new BufferedReader(new InputStreamReader(entity.getContent()));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

    }

    public static void buildMethod() throws Exception {
        URL url = new URL(serviceUrl);
//GET OPTION HEAD PUT POST DELETE
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestMethod("GET");
        int status = connection.getResponseCode();
        BufferedReader response = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String line;
        StringBuffer content = new StringBuffer();
        while ((line = response.readLine()) != null) {
            content.append(line);
        }
        response.close();
        System.out.println(status);
        System.out.println(content);
    }
}
