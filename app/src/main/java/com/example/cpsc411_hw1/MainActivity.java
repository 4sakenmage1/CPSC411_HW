package com.example.cpsc411_hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridLayout main = new GridLayout(this);
        ViewGroup.LayoutParams grParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );


        main.setLayoutParams(grParams);
        main.setOrientation(GridLayout.HORIZONTAL);
        main.setColumnCount(4);
        main.setRowCount(11);

        //Title
        TextView tv1 = new TextView(this);
        tv1.setText("Rules void hello1(int hour)");
        tv1.setTextSize(14);
        tv1.setBackgroundColor(Color.BLACK);
        tv1.setTextColor(Color.WHITE);

        GridLayout.Spec rowSpec1 = GridLayout.spec(0,1,1f);
        GridLayout.Spec colSpec1 = GridLayout.spec(0,4,1f);
        GridLayout.LayoutParams vParams1 = new GridLayout.LayoutParams(rowSpec1,colSpec1);
        tv1.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        tv1.setLayoutParams(vParams1);

        main.addView(tv1);

        //Properites
        TextView tv2 = new TextView(this);
        tv2.setText("properties");
        tv2.setTextSize(14);
        tv2.setBackgroundColor(Color.WHITE);
        tv2.setTextColor(Color.BLACK);

        GridLayout.Spec rowSpec2 = GridLayout.spec(1,2,1f);
        GridLayout.Spec colSpec2 = GridLayout.spec(0,1,1f);
        GridLayout.LayoutParams vParams2 = new GridLayout.LayoutParams(rowSpec2,colSpec2);
        tv2.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        tv2.setLayoutParams(vParams2);
        main.addView(tv2);

        //Name
        TextView tv3 = new TextView(this);
        tv3.setText("name");
        tv3.setTextSize(14);
        tv3.setBackgroundColor(Color.WHITE);
        tv3.setTextColor(Color.BLACK);

        GridLayout.Spec rowSpec3 = GridLayout.spec(1,1,1f);
        GridLayout.Spec colSpec3 = GridLayout.spec(0,2,1f);
        GridLayout.LayoutParams vParams3 = new GridLayout.LayoutParams(rowSpec3,colSpec3);
        tv2.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        tv2.setLayoutParams(vParams3);
        main.addView(tv3);

        //Day Hour Classification
        TextView tv4 = new TextView(this);
        tv4.setText("Day Hour Classification");
        tv4.setTextSize(14);
        tv4.setBackgroundColor(Color.WHITE);
        tv4.setTextColor(Color.BLACK);

        GridLayout.Spec rowSpec4 = GridLayout.spec(1,1,1f);
        GridLayout.Spec colSpec4 = GridLayout.spec(0,1,1f);
        GridLayout.LayoutParams vParams4 = new GridLayout.LayoutParams(rowSpec4,colSpec4);
        tv2.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        tv2.setLayoutParams(vParams4);
        main.addView(tv4);






        setContentView(main);
        //setContentView(R.layout.main_linearlayout);










    }
}
