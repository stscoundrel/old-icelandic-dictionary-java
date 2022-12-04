package com.github.stscoundrel.javatemplate;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Smoke tests for test suite.
     */
    public void testCasesRun()
    {
        assertTrue( true );
        assertFalse( false );

        assertEquals(App.dummyMethod(2, 2), 4);
    }
}
