package com.example.kyoungcai.myview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kyoungcai.myview.colortagview.ColorTagView;

public class MainActivity extends AppCompatActivity {


    private ColorTagView myview,myview2,myview3,myview4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myview= (ColorTagView) findViewById(R.id.myview);
        myview2= (ColorTagView) findViewById(R.id.myview2);
        myview3= (ColorTagView) findViewById(R.id.myview3);
        myview4= (ColorTagView) findViewById(R.id.myview4);
        myview.setText("时事要闻");
        myview2.setText("亲子动漫");
        myview3.setText("央视频道");
        myview4.setText("卫视频道");
    }
}
