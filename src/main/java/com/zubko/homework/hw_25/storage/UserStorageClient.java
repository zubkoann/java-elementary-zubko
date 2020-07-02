package com.zubko.homework.hw_25.storage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.squareup.okhttp.*;
import com.zubko.homework.hw_25.the_app.User;

import java.io.IOException;

public class UserStorageClient {
    private String url;
    private ObjectMapper mapper;

    public UserStorageClient(String url) {
        this.url = url;
        mapper = new JsonMapper();
    }

    public void create(User user) {
        OkHttpClient client = new OkHttpClient();
        try {
            String body = mapper.writeValueAsString(user);
            Request request = new Request.Builder()
                    .header("Accept", "application/json")
                    .put(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), body))
                    .url(url)
                    .build();
            client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update(User user) {
        OkHttpClient client = new OkHttpClient();
        try {
            String body = mapper.writeValueAsString(user);
            Request request = new Request.Builder()
                    .header("Accept", "application/json")
                    .put(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), body))
                    .url(url + "/" + user.getId())
                    .build();
            Response response = client.newCall(request).execute();
            System.out.println(response.code());
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delete(String userId) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .header("Accept", "application/json")
//                .delete()
                .url(url + "/" + userId)
                .build();
        try {
            Response response = client.newCall(request).execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public User findById(String id) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .header("Accept", "application/json")
//                .delete()
                .url(url + "/" + id)
                .build();
        try {
            Response response = client.newCall(request).execute();
            System.out.println(response.code());
            System.out.println(response.body().string());
            return mapper.readValue(response.body().string(), User.class);
        } catch (Exception e) {
            throw new RuntimeException("sdsdf");
        }
    }
}
