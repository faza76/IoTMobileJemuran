package com.example.iotmobilejemuran;


import com.example.iotmobilejemuran.Model.Jemuran;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface JemuranServices {

    @GET("Jemuran")
    Observable<List<Jemuran>> getJemuran();

}
