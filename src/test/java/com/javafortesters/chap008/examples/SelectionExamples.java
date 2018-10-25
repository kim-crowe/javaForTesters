package com.javafortesters.chap008.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SelectionExamples {

    @Test
    public void catOrCats()
    {
        assertEquals("1 == cat", "cat", catOrCats(1));
        assertEquals("0 == cat", "cats", catOrCats(0));
        assertEquals("1 == cats", "cats", catOrCats(2));
    }

    public String catOrCats(int numberOfCats){
      return (numberOfCats == 1) ? "cat" : "cats";
    }

    @Test
    public void assertIsTrue(){
        Boolean truthy = true;
        if (truthy) assertTrue(truthy);
    }

    @Test
    public void assertTrueAndFalse(){
        Boolean truthy = true;
        if (truthy) {
            assertTrue(truthy);
            assertFalse(!truthy);
        }
    }

    @Test
    public void tru


}
