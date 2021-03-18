package com.in28minutes.spring.basics.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

public class AssertTest {

    @BeforeEach
    public void before(){
        System.out.println("before");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("beforeAll");
    }

    @Test
    public void sum_with4Numbers(){
        MyMath myMath = new MyMath();
        AssertionErrors.assertEquals("Error", myMath.sum(new int[] {1,2,3,4}), 10);
    }


    @Test
    public void test2(){
        MyMath myMath = new MyMath();
        AssertionErrors.assertEquals("Error", myMath.sum(new int[] {1,2,3,4}), 10);
    }
}
