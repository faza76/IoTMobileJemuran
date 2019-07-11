package com.example.iotmobilejemuran;


import com.example.iotmobilejemuran.Model.Jemuran;
import com.example.iotmobilejemuran.Model.User;

import java.util.List;
import java.util.concurrent.Callable;

import io.reactivex.Observable;

public class JemuranLocalRepoImpl implements JemuranLocalRepo{
    private JemuranDao JemuranDao;


    public JemuranLocalRepoImpl(JemuranDao JemuranDao) {
        this.JemuranDao = JemuranDao;
    }

    @Override
    public Observable<List<Jemuran>> getAllJemuran() {
        return Observable.fromCallable(new Callable<List<Jemuran>>() {
            @Override
            public List<Jemuran> call() throws Exception {
                return JemuranDao.getAll();
            }
        });
    }

    @Override
    public void addJemuran(List<Jemuran> jemurans) {
        JemuranDao.insertAll(jemurans);
    }


}
