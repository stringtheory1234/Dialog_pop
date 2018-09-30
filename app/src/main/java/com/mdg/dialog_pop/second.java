package com.mdg.dialog_pop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
       Bundle keeper= getIntent().getExtras();
       float counter = keeper.getFloat("counter");

       Bundle gotKeeper=getIntent().getExtras();
       int score=gotKeeper.getInt("key");
        if(counter<1.75)
        {
            TextView tv= second.this.findViewById(R.id.textView3);
            tv.setVisibility(View.VISIBLE);
        }
        if(counter<3.5&&counter>=1.75)
        {
            TextView tv1=second.this.findViewById(R.id.textView4);
            tv1.setVisibility(View.VISIBLE);
        }
        if(counter<5.25&&counter>=3.5)
        {
            TextView tv2=second.this.findViewById(R.id.textView5);
            tv2.setVisibility(View.VISIBLE);
        }
        if(counter>=5.25)
        {
            TextView tv3=second.this.findViewById(R.id.textView6);
            tv3.setVisibility(View.VISIBLE);
        }
    }
}
