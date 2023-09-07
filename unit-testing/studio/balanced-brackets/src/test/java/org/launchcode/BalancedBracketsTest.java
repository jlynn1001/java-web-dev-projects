package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }


    @Test
    public void testSingleSet() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testTwoSets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[] []"));
    }
    @Test
    public void testSetContainingWords() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[code]"));
    }
    @Test
    public void testBackwardSet() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void testOddNumberBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[launch][code"));
    }
    @Test
    public void testSingleBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void testSeparateThreeBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[, [["));
    }
    @Test
    public void testTwoOpen() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }
    @Test
    public void testBackwardSetWithWords() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]code["));
    }
    @Test
    public void testTwoNested() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
        }
        @Test
    public void setBeforeWords(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Launch code"));
        }
    }

