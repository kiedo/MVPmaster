package com.mvp.android.mvpmaster.presenter.home.interfaces;


import com.mvp.android.mvpmaster.base.BasePresenter;
import com.mvp.android.mvpmaster.base.IBaseModel;
import com.mvp.android.mvpmaster.base.IBaseView;

public interface HomeInterfaces {

    interface View extends IBaseView {

        void homeData(String content);
    }

    interface Model extends IBaseModel {

        public abstract String getHomeData();

    }

    public abstract class Presenter extends BasePresenter<View, Model> {
        public abstract void getHomeData();
    }

}
