package com.example.iotmobilejemuran;


import com.example.iotmobilejemuran.Model.Jemuran;

import java.util.List;

import io.reactivex.Observable;

public class JemuranRemoteRepoImpl extends BaseRemote implements JemuranRemoteRepo {
    @Override
    public Observable<List<Jemuran>> getAllUsers() {
        return create(JemuranServices.class, RemoteConfiguration.BASE_URL).getJemuran();
    }
}
