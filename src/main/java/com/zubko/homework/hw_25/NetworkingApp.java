package com.zubko.homework.hw_25;

import com.squareup.okhttp.*;
import com.zubko.homework.hm_04.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class NetworkingApp {
    public static String serviceUrl = "https://simplae-app-course.herokuapp.com/users";

    public static void main(String[] args) throws Exception {

//        buildMethod();
//        apache();
//        okPostRequest();
//        okGetRequest();
        System.out.println(okGetUserRequest("653931fd-8b3c-4fff-9fb3-ec43e636064e"));

        System.out.println();
        System.out.println(getUsers());

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

    public static NetworkUser okGetUserRequest(String id) throws Exception {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .header("Accept", "application/json")
//                .delete()
                .url(serviceUrl + "/" + id)
                .build();
        Response response = client.newCall(request).execute();
//        System.out.println(response.code());
//        System.out.println(response.body().string());

//        return mapUser(response.body().string());
        return mapJson(response.body().string()); //проблема когда есть обьект или массив
    }

    private static NetworkUser mapJson(String response) {
        JSONObject json = new JSONObject(response);
        return new NetworkUser(
                json.getString("id"),
                json.getString("email"),
                json.getString("password")
        );
    }

    public static List<NetworkUser> getUsers() throws Exception {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .header("Accept", "application/json")
                .url(serviceUrl)
                .build();
        Response response = client.newCall(request).execute();
        JSONArray jsonResponse = new JSONArray(response.body().string());

        List<NetworkUser> users = new ArrayList<>();
        for (Object item : jsonResponse) {
            users.add(new NetworkUser(
                    ((JSONObject) item).getString("id"),
                    ((JSONObject) item).getString("email"),
                    ((JSONObject) item).getString("password")
            ));
        }
        return users;
    }

    private static NetworkUser mapUser(String response) {
        String[] fieldsWithValues = response
                .replace("{", "")
                .replace("}", "")
                .replace("\"", "")
                .split(",");
        NetworkUser newUser = new NetworkUser();
        for (String fields : fieldsWithValues) {
            String[] items = fields.split(":");
            if (items[0].equals("id")) {
                newUser.setId(items[1]);
            }
            if (items[0].equals("email")) {
                newUser.setEmail(items[1]);
            }
            if (items[0].equals("password")) {
                newUser.setPassword(items[1]);
            }
        }
        return newUser;
    }

    public static void okPostRequest() throws Exception {
        OkHttpClient client = new OkHttpClient();

        MediaType JSON = MediaType.parse("application/json; charset=utf-8");

        String id = UUID.randomUUID().toString();
        String email = StringUtils.getStringUtils("alfanumeric", 10) + "@gmail.com";
        String password = StringUtils.getStringUtils("alfanumeric", 20);

        NetworkUser user = new NetworkUser(id, email, password);

//        String content = "{\"id\": \"1111-22-3333-444-5555\",\"email\": \"email@gmail.com\", \"password\": \"1234\"}";
        Request request = new Request.Builder()
                .header("Accept", "application/json")
                .post(RequestBody.create(JSON, user.toJson()))
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
