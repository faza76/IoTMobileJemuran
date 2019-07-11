package com.example.iotmobilejemuran;

import com.example.iotmobilejemuran.Model.Jemuran;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class JemuranRepoImpl implements JemuranRepo {

    JemuranLocalRepo jemuranLocalRepo;
    JemuranRepoImpl jemuranRepo;

    public JemuranRepoImpl(JemuranRepoImpl jemuranRepo, JemuranLocalRepo jemuranLocalRepo) {
        this.jemuranLocalRepo = jemuranLocalRepo;
        this.jemuranRepo = jemuranRepo;
    }

    @Override
    public Observable<List<Jemuran>> getAllJemuran() {

        return Observable.mergeDelayError(jemuranRepo.getAllJemuran().doOnNext(new Consumer<List<Jemuran>>() {
                    @Override
                    public void accept(List<Jemuran> users) throws Exception {
                        jemuranLocalRepo.addJemuran(users);
                    }
                }).subscribeOn(Schedulers.io()), jemuranLocalRepo.getAllJemuran().subscribeOn(Schedulers.io())
        );
    }
}
