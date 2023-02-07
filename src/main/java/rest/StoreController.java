package rest;

import com.google.gson.Gson;
import okhttp3.*;
import rest.entity.Store;

import java.io.IOException;

public class StoreController {
    private Request request;
    private OkHttpClient okHttpClient;
    private Response response;

    public int findInventory() throws IOException {
        request = new Request.Builder()
                .get()
                .url("https://petstore3.swagger.io/api/v3/store/inventory")
                .build();
        okHttpClient = new OkHttpClient();
        response = okHttpClient.newCall(request).execute();
        System.out.println("Status code: " + response.code());
        assert response.body() != null;
        System.out.println("Body: " + response.body().string());
        return response.code();
    }

    public Boolean findPurchaseById(int id) throws IOException {
        request = new Request.Builder()
                .get()
                .url("https://petstore3.swagger.io/api/v3/store/order/" + id)
                .build();
        okHttpClient = new OkHttpClient();
        response = okHttpClient.newCall(request).execute();
        System.out.println("Status code: " + response.code());
        assert response.body() != null;
        System.out.println("Body: " + response.body().string());
        return response.code() == 200;
    }

    public Store createOrder(Store store) throws IOException {
        Gson gson = new Gson();

        RequestBody requestBody = RequestBody.create(gson.toJson(store), MediaType.parse("application/json"));
        request = new Request.Builder()
                .post(requestBody)
                .url("https://petstore3.swagger.io/api/v3/store/order")
                .build();

        response = new OkHttpClient().newCall(request).execute();
        assert response.body() != null;
        return gson.fromJson(response.body().string(), Store.class);
    }

    public Integer deleteRequest(int id) throws IOException {
        request = new Request.Builder()
                .delete()
                .url("https://petstore3.swagger.io/api/v3/store/order/" + id)
                .build();

        okHttpClient = new OkHttpClient();
        response = okHttpClient.newCall(request).execute();
        System.out.println("Status code of delete request: " + response.code());
        assert response.body() != null;
        return response.code();
    }

}
