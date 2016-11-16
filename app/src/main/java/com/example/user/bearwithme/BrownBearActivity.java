package com.example.user.bearwithme;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by user on 15/11/2016.
 */

public class BrownBearActivity extends AppCompatActivity {

    private EditText mQuestionEditText;
    private Button mPredictButton;
    private ImageButton mDonutButton;
    private ImageButton mCheeseBurgerButton;
    private ImageButton mBeerButton;
    private BrownBear pooky;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brown_bear);

        Resources res = getResources();



        pooky = new BrownBear("Pooky", "Brown");

//        Predictions predictions = new Predictions();
//        pooky = new BrownBear("Pooky", "Brown", predictions);

        ArrayList<Feedable> mBelly = new ArrayList<>();

        mQuestionEditText = (EditText) findViewById(R.id.question_text);
        mPredictButton = (Button) findViewById(R.id.predict);
        mDonutButton = (ImageButton) findViewById(R.id.donut);
        mCheeseBurgerButton = (ImageButton) findViewById(R.id.cheeseburger);
        mBeerButton = (ImageButton) findViewById(R.id.beer);

        mPredictButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String question = mQuestionEditText.getText().toString();

                String prediction = pooky.bearPredicts();

                Intent intent = new Intent(BrownBearActivity.this, PredictionActivity.class);

                intent.putExtra("prediction", prediction);

                startActivity(intent);
            }
        });


        mDonutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Donut donut = new Donut();
                pooky.feedBear(donut);

                Toast.makeText(BrownBearActivity.this, R.string.say_donut_text, Toast.LENGTH_SHORT).show();
            }
        });

        mCheeseBurgerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheeseBurger cheeseBurger = new CheeseBurger();
                pooky.feedBear(cheeseBurger);

                Toast.makeText(BrownBearActivity.this, R.string.say_cheeseburger_text, Toast.LENGTH_SHORT).show();
            }
        });

        mBeerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Beer beer = new Beer();
                pooky.feedBear(beer);

                Toast.makeText(BrownBearActivity.this, R.string.say_beer_text, Toast.LENGTH_SHORT).show();
            }
        });

    }
}