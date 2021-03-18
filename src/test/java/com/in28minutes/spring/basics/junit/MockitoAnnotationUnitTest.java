package com.in28minutes.spring.basics.junit;


import com.in28minutes.spring.basics.mockito.DataService;
import com.in28minutes.spring.basics.mockito.SomeBusinessImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MockitoAnnotationUnitTest {

    @Mock
    DataService dataServiceMock;

    @Mock
    List listMock;

    @InjectMocks
    SomeBusinessImpl businessImpl;

    @Test
    public void whenUseInjectMocksAnnotation_thenCorrect() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,14,9});
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(24, result);
    }

    @Test
    public void testMultipleReturns() {
        when(listMock.get(0)).thenReturn("specific param").thenReturn("second time ask");
        assertEquals("specific param", listMock.get(0));
        assertEquals("second time ask", listMock.get(0));
    }

    @Test
    public void testWildParams() {
        when(listMock.get(anyInt())).thenReturn("same return for all parameters");
        assertEquals("same return for all parameters", listMock.get(0));
        assertEquals("same return for all parameters", listMock.get(1));
    }


}