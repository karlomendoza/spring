package com.in28minutes.spring.basics.junit;

import com.in28minutes.spring.basics.mockito.DataService;
import com.in28minutes.spring.basics.mockito.SomeBusinessImpl;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.when;

public class SomeBusinessMockTest {

    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImpl businessImpl;


    public void testFindTheGreatestFromAllData() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 11, 19});
        int theGreatestFromAllData = businessImpl.findTheGreatestFromAllData();
//        assertEquals(24, theGreatestFromAllData);
    }
}