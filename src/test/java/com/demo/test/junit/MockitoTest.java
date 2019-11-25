package com.demo.test.junit;

import org.junit.*;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;

public class MockitoTest {

    @Test
    public void test(){

        // create a mock of List
        List mockList = mock(List.class);

        // call add and clear method of mocked List
        mockList.add("123");
        mockList.clear();

        // verify interaction of mocked List
        //验证行为是否发生
        verify(mockList).add("123");
        verify(mockList).clear();
    }

}