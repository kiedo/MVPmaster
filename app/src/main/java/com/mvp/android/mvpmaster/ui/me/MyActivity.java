package com.mvp.android.mvpmaster.ui.me;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.mvp.android.mvpmaster.R;
import com.mvp.android.mvpmaster.base.BaseActvity;
import com.mvp.android.mvpmaster.base.IBaseView;
import com.mvp.android.mvpmaster.model.bean.UserBean;
import com.mvp.android.mvpmaster.model.my.MyUserCenterLogin;
import com.mvp.android.mvpmaster.presenter.my.impl.UserLoginPresenter;
import com.mvp.android.mvpmaster.presenter.my.interfaces.MyLoginInterfaces;


public class MyActivity extends BaseActvity<MyUserCenterLogin, UserLoginPresenter> implements MyLoginInterfaces.View {
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
        presenter.userLogin();
    }

    @Override
    public IBaseView getBaseViewImpl() {
        return this;
    }


    @Override
    public void loginSuccess(UserBean userBean) {
        Log.e(TAG, " loginSuccess" + userBean.getUsername());
    }


    @Override
    public void loginError() {
        Log.e(TAG, " 失败");
    }
}
