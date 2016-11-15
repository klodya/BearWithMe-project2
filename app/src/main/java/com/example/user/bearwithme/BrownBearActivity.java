package com.example.user.bearwithme;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.InputStream;

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
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brown_bear);

        mQuestionEditText = (EditText) findViewById(R.id.question_text);
        mPredictButton = (Button) findViewById(R.id.predict);
        mDonutButton = (Button) findViewById(R.id.donut);
        mCheeseBurgerButton = (Button) findViewById(R.id.cheeseburger);
        mBeerButton = (Button) findViewById(R.id.beer);

        mPredictButton.setOnClickListener(this);
        mDonutButton.setOnClickListener(this);
        mCheeseBurgerButton.setOnClickListener(this);
        mBeerButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        String question = mQuestionEditText.getText().toString();

        Resources res = getResources();
        InputStream inputStream = res.openRawResource(R.raw.bad_predictions);

    }
}
