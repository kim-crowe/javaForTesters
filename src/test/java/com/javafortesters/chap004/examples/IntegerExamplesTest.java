package com.javafortesters.chap004.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {

    @Test
    public void integerExplorationInt(){
        Integer four = new Integer(4);
        assertEquals("intValue returns 4", 4, four.intValue());
    }
    @Test
    public void integerExplorationString(){
        Integer five = new Integer("5");
        assertEquals("intValue returns 5", 5, five.intValue());
    }

    @Test
    public void integerExplorationAutoBox(){
        Integer six = 6;
        assertEquals("autoboxing assignment for 6", 6, six.intValue());
    }

    @Test
    public void intToHex(){
        String b = Integer.toHexString(11);
        assertEquals("11 = b", "b", b);

        String a = Integer.toHexString(10);
        assertEquals("10 = a", "a", a);

        String three = Integer.toHexString(3);
        assertEquals("3 = 3", "3", three);

        String fifteen = Integer.toHexString(21);
        assertEquals("21 = 15", "15", fifteen);
    }

    @Test
    public void minIntValue(){
        int minValue = Integer.MIN_VALUE;
        assertEquals("min value = -2147483648", -2147483648, minValue);
    }

    @Test
    public void maxIntValue(){
        int maxValue = Integer.MAX_VALUE;
        assertEquals("max value = 2147483647", 2147483647, maxValue);
    }
}
