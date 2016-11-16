package com.example.user.bearwithme;

import java.util.ArrayList;

/**
 * Created by user on 15/11/2016.
 */

public class BlackBear extends Bear {

    Predictable mBadPredictions;
    Predictable mMediocrePredictions;
    Predictable mGoodPredictions;
    Predictable mDrunkPredictions;

    public BlackBear(String type, String name){
        super(type, name);
    }

    public void setPredictions(Predictable bad, Predictable mediocre, Predictable good, Predictable drunk) {
        mBadPredictions = bad;
        mMediocrePredictions = mediocre;
        mGoodPredictions = good;
        mDrunkPredictions = drunk;

    }

    public String bearPredicts() {
        if (bellyCount() == 0) {
            return mBadPredictions.getPrediction();
        }
        if (drunk() == true) {
            return mDrunkPredictions.getPrediction();
        }
        if (bellyCount() < 3) {
            return mMediocrePredictions.getPrediction();
        }
        if (bellyCount() >= 3) {
            return mGoodPredictions.getPrediction();
        }
        return null;
    }

}
