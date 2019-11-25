package com.demo.test.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTest2 {

    @Mock
    private List mockList;

    @Test
    public void test(){

        // call add and clear method of mocked List
        mockList.add("123");
        mockList.clear();

        // verify interaction of mocked List
        //验证行为是否发生
        verify(mockList).add("123");
        verify(mockList).clear();
    }

}