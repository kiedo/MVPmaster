package com.mvp.android.mvpmaster.presenter.home.impl;

import com.mvp.android.mvpmaster.presenter.home.interfaces.HomeInterfaces;

/**
 * Created by apple on 17/11/19.
 */

public class HomeDataImpl extends HomeInterfaces.Presenter {
    @Override
    public void getHomeData() {
        String homeData = model.getHomeData();
        view.homeData(homeData);
    }
}
