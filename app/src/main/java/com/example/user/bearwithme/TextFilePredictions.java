package com.example.user.bearwithme;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by user on 15/11/2016.
 */

public class TextFilePredictions {

    private ArrayList<String> mPredictions;
    private Scanner mFileReader;

    public TextFilePredictions(InputStream file){
        mPredictions = new ArrayList<>();
        mFileReader = new Scanner(file);
        setUpPredictions();
    }

    private void setUpPredictions(){
        boolean moreLinesToRead = mFileReader.hasNextLine();

        while (moreLinesToRead) {
            String lineOfText = mFileReader.nextLine();
            mPredictions.add(lineOfText);

            moreLinesToRead = mFileReader.hasNextLine();
        }
    }

    public String getPrediction(){
        Random rand = new Random();
        int arrayLength = mPredictions.size();
        int randomIndex = rand.nextInt(arrayLength);
        String randomPrediction = mPredictions.get(randomIndex);

        return  randomPrediction;
    }
}
