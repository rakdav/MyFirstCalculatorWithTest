package com.example.myfirstcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        Culculator calculator=new Culculator();
        assertEquals(4, calculator.Add(2,2),0.1);
        assertEquals(-1, calculator.Sub(2,3),0.1);
        assertEquals(10, calculator.Mult(2,5),0.1);
        assertEquals(0.4, calculator.Div(2,5),0.1);
    }
}