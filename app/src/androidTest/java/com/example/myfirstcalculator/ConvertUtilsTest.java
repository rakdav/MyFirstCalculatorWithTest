package com.example.myfirstcalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConvertUtilsTest {

    @Test
    public void stringToInteger() throws Exception
    {
        assertEquals(2, ConvertUtils.stringToInteger("2"));
        assertEquals(-2, ConvertUtils.stringToInteger("-2"));
        assertEquals(0, ConvertUtils.stringToInteger(""));
        assertEquals(0, ConvertUtils.stringToInteger("a"));
    }
}