package com.example.myfirstcalculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CulculatorTest {
    Culculator calculator;
    @Before
    public void setUp() throws Exception {
        System.out.println("\r\nsetUp");
        calculator = new Culculator();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    @Test
    public void add() {
        System.out.println("add");
        assertEquals(9, calculator.Add(6,3),0.1);
    }

    @Test
    public void sub() {
        System.out.println("subtract");
        assertEquals(3, calculator.Sub(6,3),0.1);
    }

    @Test
    public void mult() {
        System.out.println("multiply");
        assertEquals(18, calculator.Mult(6,3),0.1);
    }

    @Test
    public void div() {
        System.out.println("divide");
        assertEquals(2, calculator.Div(6,3),0.1);
    }
}