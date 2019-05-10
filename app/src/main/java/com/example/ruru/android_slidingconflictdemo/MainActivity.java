package com.example.ruru.android_slidingconflictdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.ruru.android_slidingconflictdemo.differentDirection.LV_VP_4;
import com.example.ruru.android_slidingconflictdemo.differentDirection.SRL_VP_1;
import com.example.ruru.android_slidingconflictdemo.differentDirection.SV_VP_2;
import com.example.ruru.android_slidingconflictdemo.differentDirection.VP_LV_5;
import com.example.ruru.android_slidingconflictdemo.differentDirection.VP_SV_3;
import com.example.ruru.android_slidingconflictdemo.sameDirection.SRL_RV_2;
import com.example.ruru.android_slidingconflictdemo.sameDirection.SRL_SV_1;
import com.example.ruru.android_slidingconflictdemo.sameDirection.SV_RV_3;
import com.example.ruru.android_slidingconflictdemo.sameDirection.VP_VP;
import com.example.ruru.android_slidingconflictdemo.test.MethodTestActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //SameDirection
    public void SRL_SV(View v) {
        startActivity(new Intent(this, SRL_SV_1.class));
    }

    public void SRL_RV(View v) {
        startActivity(new Intent(this, SRL_RV_2.class));
    }

    public void SV_RV(View v) {
        startActivity(new Intent(this, SV_RV_3.class));
    }

    public void VP_VP(View v) {
        startActivity(new Intent(this, VP_VP.class));
    }

    //DifferentDirection
    public void SRL_VP(View v) {
        startActivity(new Intent(this, SRL_VP_1.class));
    }

    public void SV_VP(View v) {
        startActivity(new Intent(this, SV_VP_2.class));
    }

    public void VP_SV(View v) {
        startActivity(new Intent(this, VP_SV_3.class));
    }

    public void LV_VP(View v) {
        startActivity(new Intent(this, LV_VP_4.class));
    }

    public void VP_LV(View v) {
        startActivity(new Intent(this, VP_LV_5.class));
    }

    //test
    public void METHOD_TEST(View v) {
        startActivity(new Intent(this, MethodTestActivity.class));
    }
}
