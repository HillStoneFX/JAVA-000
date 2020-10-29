package org.example.client;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class OkHttpTest
{
    public static void main( String[] args ) throws Exception {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder().url("http://localhost:8801").build();

        try(Response response = client.newCall(request).execute()) {
            ResponseBody body = response.body();
            System.out.println(body.string());
        }
    }
}
