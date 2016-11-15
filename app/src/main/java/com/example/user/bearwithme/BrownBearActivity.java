package com.example.user.bearwithme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 15/11/2016.
 */

public class BrownBearActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mQuestionEditText;
    private Button mPredictButton;
    private Button mDonutButton;
    private Button mCheeseBurgerButton;
    private Button mBeerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brown_bear);

        mQuestionEditText = (EditText) findViewById(R.id.question_text);
        mPredictButton = (Button) findViewById(R.id.predict);
        mDonutButton = (Button) findViewById(R.id.donut);
        mCheeseBurgerButton = (Button) findViewById(R.id.cheeseburger);
        mBeerButton = (Button) findViewById(R.id.beer);

    }


    @Override
    public void onClick(View view) {

    }
}
