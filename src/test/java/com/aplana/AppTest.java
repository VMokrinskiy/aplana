package com.aplana;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    App app = new App();
    String s = "5+8-7";
    public void testAppSum()
    {
        assertTrue( app.resultt(s)==6 );
    }
    public void testAppSIsEmpty(){
        assertFalse(s.equals(""));
    }
    public void testAppContainsIllegalSymbols(){
        assertFalse(s.contains("[A-Za-z]"));
    }
}
