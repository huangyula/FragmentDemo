package com.hy.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by and on 2018-08-21.
 */

public class MyFragment1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View contentView=inflater.inflate(R.layout.fragment1,container,false);
        return contentView;
    }

    //设置接口回调方法
    public void sendMessage(ICallBack iCallBack){
        iCallBack.get_msg_from_Fragment("消息:我来自Fragment");
    }
}
