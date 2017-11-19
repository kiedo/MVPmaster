package com.mvp.android.mvpmaster.model.hemo;

import com.mvp.android.mvpmaster.presenter.home.interfaces.HomeInterfaces;


public class HomeDataModel implements HomeInterfaces.Model {

    @Override
    public String getHomeData() {
        return "home data";
    }
}
