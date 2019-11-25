package com.demo.test.junit;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.*;


public class MockitoTest3 {

    public MockitoTest3(){
        MockitoAnnotations.initMocks(this);
    }

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

    @Test
    public void simpleTest(){

        //创建mock对象，参数可以是类，也可以是接口
        List<String> list = mock(List.class);

        //设置方法的预期返回值
        when(list.get(0)).thenReturn("helloworld");

        String result = list.get(0);

        //验证方法调用(是否调用了get(0))
        verify(list).get(0);

        //junit测试
        Assert.assertEquals("helloworld", result);
    }

}