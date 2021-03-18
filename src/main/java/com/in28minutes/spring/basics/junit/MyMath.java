package com.in28minutes.spring.basics.junit;

import org.springframework.stereotype.Service;

@Service
public class MyMath {

    int sum(int [] numbers){
      int sum =0;
      for(int i : numbers){
          sum+= i;
      }
      return sum;
    }
}
