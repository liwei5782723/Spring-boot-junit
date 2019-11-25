package com.demo.test.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class MockitoTest4 {

    @Test
    public void stubWithArgMatcher() {
        ArrayList mock = mock(ArrayList.class);

        when(mock.get(anyInt())).thenReturn("mock get method");

        System.out.println(mock.get(1));

        assertEquals(mock.get(1),"mock get method");
    }

}