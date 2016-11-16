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

import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by user on 15/11/2016.
 */

public class BlackBearActivity extends AppCompatActivity {

    private EditText mQuestionEditText;
    private Button mPredictButton;
    private ImageButton mCheeseButton;
    private ImageButton mBookButton;
    private ImageButton mCocktailButton;
    private BlackBear theodore;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_black_bear);

        Resources res = getResources();

        InputStream badInput = res.openRawResource(R.raw.bad_predictions);
        InputStream drunkInput = res.openRawResource(R.raw.drunk_predictions);
        InputStream mediocreInput = res.openRawResource(R.raw.mediocre_predictions);
        InputStream goodInput = res.openRawResource(R.raw.good_predictions);

        TextFilePredictions bad = new TextFilePredictions(badInput);
        TextFilePredictions drunk = new TextFilePredictions(drunkInput);
        TextFilePredictions good = new TextFilePredictions(goodInput);
        TextFilePredictions mediocre = new TextFilePredictions(mediocreInput);


        theodore = new BlackBear("Pooky", "Brown");
        theodore.setPredictions(bad, mediocre, good, drunk);

        ArrayList<Feedable> mBelly = new ArrayList<>();

        mQuestionEditText = (EditText) findViewById(R.id.question_text);
        mPredictButton = (Button) findViewById(R.id.predict);
        mCheeseButton = (ImageButton) findViewById(R.id.cheese);
        mBookButton = (ImageButton) findViewById(R.id.book);
        mCocktailButton = (ImageButton) findViewById(R.id.cocktail);

        mPredictButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String question = mQuestionEditText.getText().toString();

                String prediction = theodore.bearPredicts();

                Intent intent = new Intent(BlackBearActivity.this, PredictionActivityBlack.class);

                intent.putExtra("prediction", prediction);

                startActivity(intent);
            }
        });



        mCheeseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cheese cheese = new Cheese();
               theodore.feedBear(cheese);

                Toast.makeText(BlackBearActivity.this, R.string.say_cheese_text, Toast.LENGTH_SHORT).show();
            }
        });

        mBookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Book books = new Book();
                theodore.feedBear(books);

                Toast.makeText(BlackBearActivity.this, R.string.say_book_text, Toast.LENGTH_SHORT).show();
            }
        });

        mCocktailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Beer beer = new Beer();
                theodore.feedBear(beer);

                Toast.makeText(BlackBearActivity.this, R.string.say_cocktail_text, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
