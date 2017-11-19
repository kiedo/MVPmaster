package com.mvp.android.mvpmaster.base;


/**
 * 业务逻辑处理
 */
public class BasePresenter<V,M> implements IPresenter {

    protected V view;
    protected M model;

    public void bindView(V baseViewImpl) {
        view = baseViewImpl;
    }

    public void bindModel(M model) {
        this.model = model;
    }

    public void unBindModel() {
        model = null;
    }

    public void unBindView() {
        view = null;
    }
}
