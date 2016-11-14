package com.example.user.bearwithme;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.*;
import static org.junit.Assert.assertTrue;

/**
 * Created by user on 13/11/2016.
 */

public class BearTest {

    BrownBear brownBear;
    ArrayList<Feedable> mBelly;
    Beer beer;
    Donut donut;
    CheeseBurger cheeseBurger;

    @Before
    public void before(){
        brownBear = new BrownBear("Brown", "Pooky", mBelly);
        beer = new Beer();
        donut = new Donut();
        cheeseBurger = new CheeseBurger();
    }

    @Test
    public void bearHasType(){
        assertEquals("Pooky", brownBear.name());
    }

    @Test
    public void bearHasName(){
        assertEquals("Brown", brownBear.type());
    }

    @Test
    public void setBearName(){
        brownBear.setBearName("Henry");
        assertEquals("Henry", brownBear.name());
    }

    @Test
    public void bearIsHungry(){
        assertEquals(0, brownBear.bellyCount());
    }

    @Test
    public void bearGetsFedDonut(){
        brownBear.feedBear(donut);
        assertEquals(1, brownBear.bellyCount());
    }

    @Test
    public void bearGetsFedBeerAndDonut(){
        brownBear.feedBear(donut);
        brownBear.feedBear(beer);
        assertEquals(2, brownBear.bellyCount());
    }

    @Test
    public void bearFoodComa(){
        brownBear.feedBear(cheeseBurger);
        brownBear.feedBear(beer);
        brownBear.feedBear(donut);
        brownBear.foodComa();
        assertEquals(0, brownBear.bellyCount());
    }

    @Test
    public void bearCanDiet(){
        brownBear.feedBear(donut);
        Feedable food = brownBear.diet();
        assertNotNull(food);
    }

    @Test
    public void bearCanGetDrunk(){
        brownBear.feedBear(beer);
        assertEquals(true, brownBear.drunk());
    }

    @Test
    public void bearCanPredictBellyEmpty(){
        assertEquals("Shoo Human", brownBear.bearPredicts());
    }

    @Test
    public void bearCanPredictBellyHalfFull(){
        brownBear.feedBear(cheeseBurger);
        assertEquals("I like the taste of donuts.", brownBear.bearPredicts());
    }

    @Test
    public void bearCanPredictBellyFull(){
        brownBear.feedBear(cheeseBurger);
        brownBear.feedBear(donut);
        brownBear.feedBear(beer);
        brownBear.feedBear(beer);
        assertEquals("Sure, why not.", brownBear.bearPredicts());
    }

}
