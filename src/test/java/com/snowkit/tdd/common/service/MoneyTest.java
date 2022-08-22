package com.snowkit.tdd.common.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    @Test
    void testMultiplication() {
        Money dollar = Money.dollar(5);
        assertEquals(Money.dollar(5 * 2), dollar.times(2));
        assertEquals(Money.dollar(5 * 3), dollar.times(3));
    }

    @Test
    void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    void testFrancMultiplication() {
        Money franc = Money.franc(5);
        assertEquals(Money.franc(5 * 2), franc.times(2));
        assertEquals(Money.franc(5 * 3), franc.times(3));
    }

    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    void testDifferentClassEquality() {
        assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
        assertTrue(new Money(10, "USD").equals(new Dollar(10, "USD")));
    }
}
