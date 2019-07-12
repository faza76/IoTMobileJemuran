package com.example.iotmobilejemuran.Repository;


import com.example.iotmobilejemuran.Base.BaseRemote;
import com.example.iotmobilejemuran.Base.JemuranServices;
import com.example.iotmobilejemuran.Model.Jemuran;
import com.example.iotmobilejemuran.Base.RemoteConfiguration;

import java.util.List;

import io.reactivex.Observable;

public class JemuranRemoteRepoImpl extends BaseRemote implements JemuranRemoteRepo {
    @Override
    public Observable<List<Jemuran>> getAllUsers() {
        return create(JemuranServices.class, RemoteConfiguration.BASE_URL).getJemuran();
    }
}
