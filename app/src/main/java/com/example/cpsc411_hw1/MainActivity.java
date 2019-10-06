package com.example.cpsc411_hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
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
        TextView tv = new TextView(this);
        tv.setText("Rules void hello1(int hour)");
        tv.setTextSize(14);
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextColor(Color.WHITE);

        GridLayout.Spec rowSpec = GridLayout.spec(0,1,1f);
        GridLayout.Spec colSpec = GridLayout.spec(0,4,1f);
        GridLayout.LayoutParams vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        tv.setLayoutParams(vParams);

        main.addView(tv);

        //Properites
        tv = new TextView(this);
        tv.setText("properties");
        tv.setTextSize(14);
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(1,2,1f);
        colSpec = GridLayout.spec(0,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //Name
        tv = new TextView(this);
        tv.setText("name");
        tv.setTextSize(14);
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(1,1,1f);
        colSpec = GridLayout.spec(1,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //Day Hour Classification
        tv = new TextView(this);
        tv.setText("Day Hour Classification");
        tv.setTextSize(14);
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(1,1,1f);
        colSpec = GridLayout.spec(2,2,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //Category
        tv = new TextView(this);
        tv.setText("category");
        tv.setTextSize(14);
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(2,1,1f);
        colSpec = GridLayout.spec(1,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //Day and time
        tv = new TextView(this);
        tv.setText("Day and Time");
        tv.setTextSize(14);
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(2,1,1f);
        colSpec = GridLayout.spec(2,2,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        tv.setLayoutParams(vParams);
        main.addView(tv);


        //Rule
        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTextSize(14);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(3,1,1f);
        colSpec = GridLayout.spec(0,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //C1
        tv = new TextView(this);
        tv.setText("C1");
        tv.setTextSize(14);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(3,1,1f);
        colSpec = GridLayout.spec(1,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //A1
        tv = new TextView(this);
        tv.setText("A1");
        tv.setTextSize(14);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(3,1,1f);
        colSpec = GridLayout.spec(2,2,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        tv.setLayoutParams(vParams);
        main.addView(tv);


        // " "
        tv = new TextView(this);
        tv.setText(" ");
        tv.setTextSize(14);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(4,1,1f);
        colSpec = GridLayout.spec(0,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //min <= hour && hour <= max
        tv = new TextView(this);
        tv.setText("min<=hour && hour<=max");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(4,1,1f);
        colSpec = GridLayout.spec(1,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //"System.out.println(greeting + \", World!\")"
        tv = new TextView(this);
        tv.setText("System.out.println(greeting + \", World!\")");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(4,1,1f);
        colSpec = GridLayout.spec(2,2,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        // " "
        tv = new TextView(this);
        //tv.setText("");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(5,1,1f);
        colSpec = GridLayout.spec(0,1, 1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.CENTER_HORIZONTAL);
        tv.setLayoutParams(vParams);
        main.addView(tv);


        // int min
        tv = new TextView(this);
        tv.setText("int min");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(5,1,1f);
        colSpec = GridLayout.spec(1,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.CENTER_HORIZONTAL);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        // int max
        tv = new TextView(this);
        tv.setText("int max");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(5,1,1f);
        colSpec = GridLayout.spec(2,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.CENTER_HORIZONTAL);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //String Greeting
        tv = new TextView(this);
        tv.setText("String Greeting");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(5,1,1f);
        colSpec = GridLayout.spec(3,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.CENTER_HORIZONTAL);
        tv.setLayoutParams(vParams);
        main.addView(tv);


        //Rule
        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTextSize(14);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(6,1,1f);
        colSpec = GridLayout.spec(0,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.LEFT);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //R20
        tv = new TextView(this);
        tv.setText("R10");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(7,1,1f);
        colSpec = GridLayout.spec(0,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.LEFT);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //R20
        tv = new TextView(this);
        tv.setText("R20");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(8,1,1f);
        colSpec = GridLayout.spec(0,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.LEFT);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //R30
        tv = new TextView(this);
        tv.setText("R30");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(9,1,1f);
        colSpec = GridLayout.spec(0,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.LEFT);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //R40
        tv = new TextView(this);
        tv.setText("R40");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(10,1,1f);
        colSpec = GridLayout.spec(0,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.LEFT);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //From
        tv = new TextView(this);
        tv.setText("From");
        tv.setTextSize(14);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(6,1,1f);
        colSpec = GridLayout.spec(1,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.LEFT);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //0
        tv = new TextView(this);
        tv.setText("0");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(7,1,1f);
        colSpec = GridLayout.spec(1,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //12
        tv = new TextView(this);
        tv.setText("12");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(8,1,1f);
        colSpec = GridLayout.spec(1,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //18
        tv = new TextView(this);
        tv.setText("18");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(9,1,1f);
        colSpec = GridLayout.spec(1,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //2
        tv = new TextView(this);
        tv.setText("22");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(10,1,1f);
        colSpec = GridLayout.spec(1,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //To
        tv = new TextView(this);
        tv.setText("To");
        tv.setTextSize(14);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(6,1,1f);
        colSpec = GridLayout.spec(2,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.LEFT);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //11
        tv = new TextView(this);
        tv.setText("11");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(7,1,1f);
        colSpec = GridLayout.spec(2,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //17
        tv = new TextView(this);
        tv.setText("17");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(8,1,1f);
        colSpec = GridLayout.spec(2,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //21
        tv = new TextView(this);
        tv.setText("21");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(9,1,1f);
        colSpec = GridLayout.spec(2,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //23
        tv = new TextView(this);
        tv.setText("23");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(10,1,1f);
        colSpec = GridLayout.spec(2,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(vParams);
        main.addView(tv);



        //Greeting
        tv = new TextView(this);
        tv.setText("Greeting");
        tv.setTextSize(14);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setBackgroundColor(Color.RED);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(6,1,1f);
        colSpec = GridLayout.spec(3,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.LEFT);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //Good Morning
        tv = new TextView(this);
        tv.setText("Good Morning");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.RED);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(7,1,1f);
        colSpec = GridLayout.spec(3,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.LEFT);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //Good Afternoon
        tv = new TextView(this);
        tv.setText("Good Afternoon");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.RED);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(8,1,1f);
        colSpec = GridLayout.spec(3,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.LEFT);
        tv.setLayoutParams(vParams);
        main.addView(tv);

        //Good Evening
        tv = new TextView(this);
        tv.setText("Good Evening");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.RED);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(9,1,1f);
        colSpec = GridLayout.spec(3,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.LEFT);
        tv.setLayoutParams(vParams);
        main.addView(tv);


        // Good Night
        tv = new TextView(this);
        tv.setText("Good Night");
        tv.setTextSize(12);
        tv.setBackgroundColor(Color.RED);
        tv.setTextColor(Color.BLACK);

        rowSpec = GridLayout.spec(10,1,1f);
        colSpec = GridLayout.spec(3,1,1f);
        vParams = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setGravity(Gravity.LEFT);
        tv.setLayoutParams(vParams);
        main.addView(tv);


        setContentView(main);
        //setContentView(R.layout.main_linearlayout);










    }
}
