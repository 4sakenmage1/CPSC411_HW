package com.example.cpsc411_hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //--title BEGIN -- //
        TextView tvTitle = new TextView(this); //TextView Object for Title
        tvTitle.setText("Rules void hello1(int hour)");
        tvTitle.setTextSize(14);
        tvTitle.setTextColor(Color.WHITE);
        tvTitle.setBackgroundColor(Color.BLACK);
        tvTitle.setGravity(Gravity.CENTER_HORIZONTAL);
        tvTitle.setPadding(10,10,10,10);

        ViewGroup.LayoutParams titleParams = new ViewGroup.LayoutParams(

                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        tvTitle.setLayoutParams(titleParams);


        setContentView(R.layout.main_linearlayout);
        //--title END --//


        //properties BEGIN -- //





    }
}
