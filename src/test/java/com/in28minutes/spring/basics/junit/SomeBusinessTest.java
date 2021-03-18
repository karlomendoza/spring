package com.in28minutes.spring.basics.junit;

import com.in28minutes.spring.basics.mockito.DataService;
import com.in28minutes.spring.basics.mockito.SomeBusinessImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SomeBusinessTest {


    public void testFindTheGreatestFromAllData() {
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
        int theGreatestFromAllData = businessImpl.findTheGreatestFromAllData();
        assertEquals(24, theGreatestFromAllData);
    }

}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {24, 6, 15};
    }
}