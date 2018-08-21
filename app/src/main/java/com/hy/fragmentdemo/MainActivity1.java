package com.hy.fragmentdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {
    TextView text;
    Button mButton;
    ICallBack mICallBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        text = (TextView) findViewById(R.id.text);
        mButton=(Button)findViewById(R.id.button);

        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();

        final MyFragment1 fragment1=new MyFragment1();
        transaction.add(R.id.fragment_container,fragment1);
        transaction.commit();

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               fragment1.sendMessage(new ICallBack() {
                   @Override
                   public void get_msg_from_Fragment(String string) {
                      text.setText(string);
                   }
               });
            }
        });


    }
}
