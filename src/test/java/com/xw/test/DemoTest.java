package com.xw.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2016/12/3.
 */
public class DemoTest {

    Demo demo = new Demo();
    @Test
    public void testGetmsg(){
        String msg = demo.getMsg();
        Assert.assertEquals("msg", msg);
    }

    @Test
    public void testSum(){
        int sum = demo.sum(100, 200);
        Assert.assertTrue(sum == 300);
    }
}
