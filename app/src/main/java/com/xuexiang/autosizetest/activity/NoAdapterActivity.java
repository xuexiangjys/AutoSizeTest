package com.xuexiang.autosizetest.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.xuexiang.autosizetest.R;

import me.jessyan.autosize.internal.CancelAdapt;

/**
 * @author xuexiang
 * @since 2018/11/6 下午11:58
 */
public class NoAdapterActivity extends AppCompatActivity implements CancelAdapt {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_test_view);
    }
}
