package com.mvp.android.mvpmaster.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.mvp.android.mvpmaster.R;
import com.mvp.android.mvpmaster.base.BaseActvity;
import com.mvp.android.mvpmaster.base.IBaseView;
import com.mvp.android.mvpmaster.model.hemo.HomeDataModel;
import com.mvp.android.mvpmaster.presenter.home.impl.HomeDataImpl;
import com.mvp.android.mvpmaster.presenter.home.interfaces.HomeInterfaces;

public class MainActivity extends BaseActvity<HomeDataModel, HomeDataImpl> implements HomeInterfaces.View {


    @Override
    public int getContentId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView(View view, Bundle savedInstanceState) {

    }

    @Override
    public void onEvent() {

    }

    @Override
    public void lazyLoadData() {
        presenter.getHomeData();
    }

    @Override
    public IBaseView getBaseViewImpl() {
        return this;
    }


    @Override
    public void homeData(String content) {
        Log.e(TAG,content);
    }
}
