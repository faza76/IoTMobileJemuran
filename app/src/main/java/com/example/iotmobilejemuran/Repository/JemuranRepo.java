package com.example.iotmobilejemuran.Repository;

import com.example.iotmobilejemuran.Model.Jemuran;

import java.util.List;

import io.reactivex.Observable;

public interface JemuranRepo {

    public Observable<List<Jemuran>> getAllJemuran();

}
