package Junit.TestMethod;

import Junit.TestClass.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * @author zhangchenyu
 * @date 2021-03-25 9:16
 */
public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator c= new Calculator();
        int result=c.add(1,2);
        System.out.println(result);
        Assert.assertEquals(3,result);
    }

    @Before
    public void init(){
        System.out.println("init...");
    }

    @After
    public void close(){
        System.out.println("close...");
    }
}
