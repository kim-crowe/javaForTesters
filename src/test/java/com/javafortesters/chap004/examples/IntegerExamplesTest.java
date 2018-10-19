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
}
