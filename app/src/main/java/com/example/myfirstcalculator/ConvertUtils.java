package com.example.myfirstcalculator;

public class ConvertUtils
{
    public static int stringToInteger(String s) {
        int result = 0;
        try {
            result = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return result;
    }
}
