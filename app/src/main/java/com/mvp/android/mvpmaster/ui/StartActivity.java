package com.mvp.android.mvpmaster.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mvp.android.mvpmaster.R;
import com.mvp.android.mvpmaster.ui.me.MyActivity;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;


public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Observable.timer(2, TimeUnit.SECONDS).
                observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) throws Exception {
                        start();
                    }
                });
    }

    private void start() {
        startActivity(new Intent(this, MyActivity.class));
        finish();
    }

}
