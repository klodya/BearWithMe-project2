package com.example.user.bearwithme;

import java.util.ArrayList;


/**
 * Created by user on 13/11/2016.
 */

public abstract class Bear {

    private ArrayList<Feedable> mBelly;
    private String type;
    private String name;

    public Bear(String type, String name, ArrayList<Feedable> belly){
        this.type = type;
        this.name = name;
        this.mBelly = new ArrayList<Feedable>();
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


}
