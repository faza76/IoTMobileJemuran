package com.example.iotmobilejemuran;

import com.example.iotmobilejemuran.Model.Jemuran;

import java.util.List;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;

public class JemuranPresenterImpl extends JemuranPresenter {

    private JemuranRepo jemuranRepo;
    private Scheduler scheduler;
    private Disposable disposable;

    public JemuranPresenterImpl(JemuranRepo jemuranRepo,Scheduler scheduler){
        this.jemuranRepo = jemuranRepo;
        this.scheduler = scheduler;
    }

    @Override
    public void getJemuran() {
        if (!isViewAttached())
            return;

        getView().showLoading();


        disposable = jemuranRepo.getAllJemuran().observeOn(scheduler).subscribeWith(new DisposableObserver<List<Jemuran>>() {
            @Override
            public void onNext(List<Jemuran> jemurans) {
                if (!isViewAttached())
                    return;

                getView().showJemuran(jemurans);

            }

            @Override
            public void onError(Throwable e) {
                if (!isViewAttached())
                    return;
                getView().showError(e.getLocalizedMessage());
            }

            @Override
            public void onComplete() {

            }
        });
    }

    @Override
    public void onDetach() {
        super.onDetach();
        disposable.dispose();


    }


}
