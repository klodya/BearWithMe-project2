package com.example.user.bearwithme;

import android.renderscript.ScriptGroup;

import java.io.InputStream;
import java.util.ArrayList;

import static com.example.user.bearwithme.R.raw.bad_predictions;


/**
 * Created by user on 13/11/2016.
 */

public abstract class Bear {

    private ArrayList<Feedable> mBelly;
    private String type;
    private String name;


    public Bear(String type, String name) {
        this.type = type;
        this.name = name;
        this.mBelly = new ArrayList<>();
    }

    public String type() {
        return this.type;
    }

    public String name() {
        return this.name;
    }

    public void setBearName(String name) {
        this.name = name;
    }

    public void feedBear(Feedable food) {
        this.mBelly.add(food);
    }

    public int bellyCount() {
        return this.mBelly.size();
    }

    public Feedable diet() {
        if (bellyCount() > 0) {
            return mBelly.remove(0);
        }
        return null;
    }

    public void foodComa() {
        this.mBelly.clear();
    }

    public boolean drunk() {
        if (mBelly.isEmpty()) {
            return false;
        }

        for (Feedable item : mBelly) {
            if (item.feedableType() != "Booze") {
                return false;
            }
        }
        return true;
    }
}

