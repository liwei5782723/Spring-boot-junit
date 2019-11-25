package com.demo.test.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class FirstTestTest {

    @BeforeClass
    public static  void beforeClass() {
        System.out.println("开始测试-----------------BeforeClass");
    }

    @Before
    public void Before() {
        System.out.println("开始测试-----------------Before");
    }

    @After
    public void after() {
        System.out.println("测试结束-----------------after");
    }

    @AfterClass
    public static  void afterClass() {
        System.out.println("测试结束-----------------AfterClass");
    }

    @Test
    public void helloWorld() {
        System.out.println("测试-----------------helloWorld");
    }

    @Test
    public void helloWord2() {
        System.out.println("测试-----------------helloWorld2");
    }
}