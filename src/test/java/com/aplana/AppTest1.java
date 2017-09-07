package com.aplana;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest1 {

    App app = new App();
    String s = "5+8-7";
    @Test
    public void testAppSum()
    {
        assertTrue( app.resultt(s)==6 );
    }
    @Test
    public void testAppSIsEmpty(){
        assertFalse(s.equals(""));
    }
    @Test
    public void testAppContainsIllegalSymbols(){
        assertFalse(s.contains("[A-Za-z]"));
    }

}