package com.example.user.bearwithme;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 15/11/2016.
 */

public class BearWithMe extends AppCompatActivity implements View.OnClickListener {

    private Button mPickBrownBearButton;
    private Button mPickBlackBearButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPickBrownBearButton = (Button) findViewById(R.id.brownBear);
        mPickBlackBearButton = (Button) findViewById(R.id.blackBear);

        mPickBrownBearButton.setOnClickListener(this);
        mPickBlackBearButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        int viewId = view.getId();
        Intent intent = null;
        if(viewId == R.id.brownBear) {
            intent = new Intent(this, BrownBearActivity.class);
        } else {
            intent = new Intent(this, BlackBearActivity.class);
        }
        startActivity(intent);
    }
}
