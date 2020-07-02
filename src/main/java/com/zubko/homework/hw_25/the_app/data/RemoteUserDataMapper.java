package com.zubko.homework.hw_25.the_app.data;

import com.squareup.okhttp.*;
import com.zubko.homework.hw_25.the_app.User;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;


public class RemoteUserDataMapper extends AbstractUserDataMapper {
    public static String serviceUrl;

    public RemoteUserDataMapper(String serviceUrl) {
        this.serviceUrl = serviceUrl;

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .header("Accept", "application/json")
                .url(serviceUrl)
                .build();
        try {
            Response response = client.newCall(request).execute();
            JSONArray jsonResponse = new JSONArray(response.body().string());

            for (Object item : jsonResponse) {
                users.add(new User(
                        ((JSONObject) item).getString("id"),
                        ((JSONObject) item).getString("email").replace("@gmail.com", ""),
                        ((JSONObject) item).getString("email"),
                        ((JSONObject) item).getString("password"),
                        "director"
                ));
            }
        } catch (Exception e) {
            throw new RuntimeException("user were not fetch");
        }
    }

    public void addUser(User u) {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .header("Accept", "application/json")
                .post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), u.toJson()))
                .url(serviceUrl)
                .build();
        Response response = null;
        try {
            response = client.newCall(request).execute();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
