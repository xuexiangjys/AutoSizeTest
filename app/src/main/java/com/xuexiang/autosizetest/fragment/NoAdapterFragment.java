package com.xuexiang.autosizetest.fragment;

import com.xuexiang.autosizetest.R;
import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xpage.base.XPageFragment;
import com.xuexiang.xpage.utils.TitleBar;

import me.jessyan.autosize.internal.CancelAdapt;

/**
 * @author xuexiang
 * @since 2018/11/7 上午12:14
 */
@Page(name = "Fragment不适配")
public class NoAdapterFragment extends XPageFragment implements CancelAdapt {

    @Override
    protected int getLayoutId() {
        return R.layout.layout_test_view;
    }

    @Override
    protected TitleBar initTitleBar() {
        return null;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initListeners() {

    }
}
