package com.xuexiang.autosizetest.fragment;

import android.view.KeyEvent;
import android.view.View;

import com.xuexiang.autosizetest.activity.AdapterActivity;
import com.xuexiang.autosizetest.activity.NoAdapterActivity;
import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xpage.base.XPageSimpleListFragment;
import com.xuexiang.xpage.utils.TitleBar;
import com.xuexiang.xutil.app.ActivityUtils;
import com.xuexiang.xutil.common.ClickUtils;

import java.util.List;

/**
 * @author xuexiang
 * @since 2018/11/6 下午11:45
 */
@Page(name = "屏幕适配")
public class MainFragment extends XPageSimpleListFragment {

    @Override
    protected List<String> initSimpleData(List<String> lists) {
        lists.add("Activity适配");
        lists.add("Activity不适配");
        lists.add("Fragment适配");
        lists.add("Fragment不适配");
        return lists;
    }

    @Override
    protected void onItemClick(int position) {
        switch(position) {
            case 0:
                ActivityUtils.startActivity(AdapterActivity.class);
                break;
            case 1:
                ActivityUtils.startActivity(NoAdapterActivity.class);
                break;
            case 2:
                openPage(AdapterFragment.class);
                break;
            case 3:
                openPage(NoAdapterFragment.class);
                break;
            default:
                break;
        }
    }



    @Override
    protected TitleBar initTitleBar() {
        return super.initTitleBar().setLeftClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClickUtils.exitBy2Click();
            }
        });
    }


    /**
     * 菜单、返回键响应
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            ClickUtils.exitBy2Click();
        }
        return true;
    }
}
