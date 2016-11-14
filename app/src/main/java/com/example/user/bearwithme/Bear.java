package com.example.user.bearwithme;

import java.lang.reflect.Array;
import java.util.ArrayList;


/**
 * Created by user on 13/11/2016.
 */

public abstract class Bear {

    private ArrayList<Feedable> mBelly;
    private String type;
    private String name;

    Predictions mBadPredictions;
    Predictions mMediocrePredictions;
    Predictions mGoodPredictions;

    public Bear(String type, String name, ArrayList<Feedable> belly){
        this.type = type;
        this.name = name;
        this.mBelly = new ArrayList<Feedable>();
        this.mBadPredictions = new Predictions();
        this.mMediocrePredictions = new Predictions();
        this.mGoodPredictions = new Predictions();
        this.mDrunkPredictions = new Predictions();
    }

    public String type(){
        return this.type;
    }

    public String name(){
        return this.name;
    }

    public void setBearName(String name) {
        this.name = name;
    }

    public void feedBear(Feedable food){
        this.mBelly.add(food);
    }

    public int bellyCount(){
        return this.mBelly.size();
    }

    public Feedable diet(){
        if (bellyCount() > 0) {
            return mBelly.remove(0);
        }
        return null;
    }

    public void foodComa(){
        this.mBelly.clear();
    }

    public boolean drunk() {
        if (mBelly.isEmpty()) {
            return false;
        }

        for (Feedable item : mBelly){
            if (item.feedableType() != "Beer") {
                return false;
            }
        }
        return true;
    }


    public String bearPredicts() {
        if (bellyCount() == 0) {
            return mBadPredictions.getBadPrediction();
        }
        if (bellyCount() < 3) {
            return mMediocrePredictions.getMediocrePrediction();
        }
        if(bellyCount() >= 3) {
            return mGoodPredictions.getGoodPrediction();
        }
        if (drunk() == true){
            return mDrunkPredictions.getDrunkPrediction();
        }
        return null;
    }
}
