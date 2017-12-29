package com.example.kegui.myslideshow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAnimationButtonTapped(View view){
        view.animate().setDuration(3000).rotation(360.0f * 5.0f).scaleX(2.5f).scaleY(2.5f).x(200.0f).y(200.0f);
    }
}
