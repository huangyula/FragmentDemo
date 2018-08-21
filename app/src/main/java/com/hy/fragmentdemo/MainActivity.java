package com.hy.fragmentdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);
//        1.获取FragmentManager
        FragmentManager fragmentManager=getSupportFragmentManager();

//        2.获取FragmentTransaction
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
//        3.创建需要添加的Fragment
        MyFragment myFragment=new MyFragment();
//        4.创建Bundle对象(存储数据,并传递到Fragment中)
        Bundle bundle=new Bundle();
//        5.往bundle中添加数据
        bundle.putString("msg","一期一会");
//        6.把数据添加到Fragment中
        myFragment.setArguments(bundle);
//        7.动态添加fragmnet
//        即将创建的fragment添加到Activity布局文件中定义的占位符中(Frameayout)
        fragmentTransaction.add(R.id.fragment_container,myFragment);
        fragmentTransaction.commit();


    }
}
