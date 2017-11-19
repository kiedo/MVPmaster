package com.mvp.android.mvpmaster.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


public abstract class BaseActvity<M extends IBaseModel, P extends BasePresenter> extends AppCompatActivity implements IBaseEvent {

    protected final String TAG = this.getClass().getSimpleName();

    protected P presenter;
    protected M model;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int contentId = getContentId();
        if (contentId != 0) {
            setContentView(getContentId());
            initView(null, savedInstanceState);
            bindMVP();
            lazyLoadData();
        }
    }

    private void bindMVP() {
        model = (M) ModePresenterFactory.getInstance().getMode(getClass(), 0);
        presenter = (P) ModePresenterFactory.getInstance().getPresenter(getClass(), 1);
        presenter.bindModel(model);
        presenter.bindView(getBaseViewImpl());

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.unBindModel();
            presenter.unBindView();
        }
    }
}
