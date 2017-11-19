package com.mvp.android.mvpmaster.presenter.my.interfaces;

import com.mvp.android.mvpmaster.base.BasePresenter;
import com.mvp.android.mvpmaster.base.IBaseModel;
import com.mvp.android.mvpmaster.base.IBaseView;
import com.mvp.android.mvpmaster.model.bean.UserBean;

/**
 * Created by apple on 17/11/19.
 */

public interface MyLoginInterfaces {
    interface View extends IBaseView {

        void loginSuccess(UserBean userBean);

        void loginError();
    }

    interface Model extends IBaseModel {

        UserBean userLogin();
    }

    abstract class Presenter extends BasePresenter<View, Model> {
        public abstract void userLogin();
    }
}
