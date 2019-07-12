package com.example.iotmobilejemuran.Repository;


import com.example.iotmobilejemuran.Dao.JemuranDao;
import com.example.iotmobilejemuran.Model.Jemuran;

import java.util.List;
import java.util.concurrent.Callable;

import io.reactivex.Observable;

public class JemuranLocalRepoImpl implements JemuranLocalRepo{
    private com.example.iotmobilejemuran.Dao.JemuranDao JemuranDao;


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
