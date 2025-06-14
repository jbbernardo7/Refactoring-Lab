package com.bmcl.refactoring.example3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleOrderTest {
    @Test
    public void testFixedDiscount() {
        SimpleOrder order = new SimpleOrder(100);
        order.setDiscount(new FixedDiscount(10));
        assertEquals(90, order.getTotal(), 0.1);
    }

    @Test
    public void testPercentageDiscount() {
        SimpleOrder order = new SimpleOrder(100);
        order.setDiscount(new PercentageDiscount(0.2));
        assertEquals(80, order.getTotal(), 0.1);
    }

    @Test
    public void testNoDiscount() {
        SimpleOrder order = new SimpleOrder(100);
        assertEquals(100, order.getTotal(), 0.1);
    }
}