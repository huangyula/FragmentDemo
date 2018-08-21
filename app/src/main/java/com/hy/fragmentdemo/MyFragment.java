package com.hy.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by and on 2018-08-21.
 */

public class MyFragment extends Fragment {
    Button button;
    TextView text;
    Bundle bundle;
    String msg="";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View contentView=inflater.inflate(R.layout.fragment,container,false);
        button = (Button) contentView.findViewById(R.id.button);
        text = (TextView) contentView.findViewById(R.id.text);

//        1.通过getArgments()获取从Activity传过来的数据
          bundle=getArguments();
//        2.获取某一值
          if(bundle!=null){
              msg=bundle.getString("msg");
          }

          button.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  text.setText(msg);
              }
          });
        return contentView;
    }
}
