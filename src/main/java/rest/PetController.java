package rest;

import com.google.gson.Gson;
import okhttp3.*;
import org.json.JSONObject;
import rest.entity.Pet;

import java.io.IOException;

public class PetController {
    public void findByStatus(String status) throws IOException {
        Request request = new Request.Builder()
                .get()
                .url("https://petstore.swagger.io/v2/pet/findByStatus?status=" + status)
                .build();
        OkHttpClient okHttpClient = new OkHttpClient();
        Response response = okHttpClient.newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.body().string());
    }

    public void createNewPet() throws IOException {
        String bodyString = "{\n" +
                "  \"id\": 92,\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "    \"name\": \"Lolstring\"\n" +
                "  },\n" +
                "  \"name\": \"doggie\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";
        RequestBody requestBody = RequestBody.create(bodyString.getBytes());
        Request request = new Request.Builder()
                .post(requestBody)
                .url("https://petstore.swagger.io/v2/pet")
                .header("Content-Type", "application/json")
                .build();

        Response response = new OkHttpClient().newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.body().string());
    }

    public void createNewPathJson(String petName) throws IOException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", "10011");
        jsonObject.put("name", petName);
        jsonObject.put("status", "available");


        RequestBody requestBody = RequestBody.create(jsonObject.toString(), MediaType.parse("application/json"));
        Request request = new Request.Builder()
                .post(requestBody)
                .url("https://petstore.swagger.io/v2/pet")
                // .header("Content-Type","application/json")
                .build();

        Response response = new OkHttpClient().newCall(request).execute();
        System.out.println(response.code());
        // System.out.println(response.body().string());

        JSONObject responseObject = new JSONObject(response.body().string());
        System.out.printf("id = %s, name = %s, status = %s,",
                responseObject.get("id"),
                responseObject.get("name"),
                responseObject.get("status"));

    }

    public void createNewPetWithJSON(Pet pet) throws IOException {
        Gson gson = new Gson();

        RequestBody requestBody = RequestBody.create(gson.toJson(pet), MediaType.parse("application/json"));

        Request request = new Request.Builder()
                .post(requestBody)
                .url("https://petstore.swagger.io/v2/pet")
                // .header("Content-Type","application/json")
                .build();

        Response response = new OkHttpClient().newCall(request).execute();
//        System.out.println(response.code());
//        System.out.println(response.body().string());

       Pet newPet =  gson.fromJson(response.body().string(), Pet.class);
        System.out.println(newPet);
    }
}
