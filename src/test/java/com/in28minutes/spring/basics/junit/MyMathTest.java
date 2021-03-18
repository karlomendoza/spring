package com.in28minutes.spring.basics.junit;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class MyMathTest {



    @Test
    public void sum_with4Numbers(){

        MyMath myMath = new MyMath();
        System.out.println(myMath.sum(new int[] {1,2,3,4}));

        assertEquals("Error", myMath.sum(new int[] {1,2,3,4}), 10);

//        Assert.isTrue(myMath.sum(new int[] {1,2,3,4}) == 11, "not same sum");


    }

}
