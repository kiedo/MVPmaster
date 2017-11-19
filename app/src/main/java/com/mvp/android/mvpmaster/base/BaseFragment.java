package com.mvp.android.mvpmaster.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public abstract class BaseFragment<M extends IBaseModel, P extends BasePresenter> extends Fragment implements IBaseEvent {

    protected P presenter;
    protected M model;
    private boolean loadData;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int contentId = getContentId();
        if (contentId != 0) {
            return inflater.inflate(contentId, null);
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view, savedInstanceState);
        onEvent();
        bindMVP();
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser && !loadData) {
            loadData = true;
            lazyLoadData();
        }
    }


    protected void bindMVP() {
        model = (M) ModePresenterFactory.getInstance().getMode(getClass(), 0);
        presenter = (P) ModePresenterFactory.getInstance().getMode(getClass(), 1);
        presenter.bindView(getBaseViewImpl());
        presenter.bindModel(model);


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.unBindView();
        presenter.unBindModel();
    }
}
