package com.example.iotmobilejemuran;

import com.example.iotmobilejemuran.Model.Jemuran;

import java.util.List;

import io.reactivex.Observable;

public interface JemuranLocalRepo {

    public Observable<List<Jemuran>> getAllJemuran();
    public void addJemuran(List<Jemuran> jemurans);
}
