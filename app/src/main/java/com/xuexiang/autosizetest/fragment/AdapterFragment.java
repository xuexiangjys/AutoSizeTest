package com.xuexiang.autosizetest.fragment;

import com.xuexiang.autosizetest.R;
import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xpage.base.XPageFragment;
import com.xuexiang.xpage.utils.TitleBar;
import com.xuexiang.xutil.display.DensityUtils;
import com.xuexiang.xutil.system.DeviceStatusUtils;

import me.jessyan.autosize.internal.CustomAdapt;

/**
 * @author xuexiang
 * @since 2018/11/7 上午12:08
 */
@Page(name = "Fragment适配")
public class AdapterFragment extends XPageFragment implements CustomAdapt {

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

    @Override
    public boolean isBaseOnWidth() {
        return false; //按高度进行适配（主要是状态栏之类的不同需要适配，不使用全局的配置）
    }

    @Override
    public float getSizeInDp() { //修改基础高度
        return 533 - DensityUtils.px2dip(getContext(), DeviceStatusUtils.getStatusBarHeight());//title默认高度是60dp
    }
}
