package com.mvp.android.mvpmaster.base;

import android.os.Bundle;
import android.view.View;

/**
 * Created by apple on 17/11/19.
 */

public interface IBaseEvent {
    /**
     * 返回布局
     *
     * @return
     */
    abstract int getContentId();

    /**
     * 初始化控件
     *
     * @param view
     * @param savedInstanceState
     */
    abstract void initView(View view, Bundle savedInstanceState);

    /**
     * 设置事件
     */
    abstract void onEvent();

    /**
     * 加载数据
     */
    abstract void lazyLoadData();

    /**
     * 返回view的操作接口
     *
     * @return
     */
    abstract IBaseView getBaseViewImpl();
}
