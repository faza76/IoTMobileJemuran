package com.example.iotmobilejemuran;

import com.example.iotmobilejemuran.Model.Jemuran;

import java.util.List;

/**
 * Created by Eslam Hussein on 3/3/18.
 */

public interface JemuranView extends MvpView {

    void showJemuran(List<Jemuran> jemurans);
    void showLoading();
    void hideLoading();
    void showError(String error);
}
