package com.liurq.test;

import org.junit.Test;

/**
 * Created by liurq on 2019/3/20.
 */
public class Test2 {

    @Test
    public void test1() {
        System.out.println("junit test,Test1.test1()");
    }

    @Test
    public void test2() {
        System.out.println("junit test,Test1.test2()");
    }

    @Test
    public void test3() throws Exception{
        throw new Exception("this is a error case:Test2.test3()");
    }

    @Test
    public void test4() throws Exception{
        throw new Exception("this is a error case:Test2.test4()");
    }
}
