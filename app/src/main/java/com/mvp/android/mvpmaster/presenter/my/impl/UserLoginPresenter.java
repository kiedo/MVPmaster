package com.mvp.android.mvpmaster.presenter.my.impl;

import com.mvp.android.mvpmaster.model.bean.UserBean;
import com.mvp.android.mvpmaster.presenter.my.interfaces.MyLoginInterfaces;



public class UserLoginPresenter extends MyLoginInterfaces.Presenter {
    @Override
    public void userLogin() {
        UserBean userBean = model.userLogin();
        if(userBean == null){
            view.loginError();
        }else{
            view.loginSuccess(userBean);
        }
    }
}
