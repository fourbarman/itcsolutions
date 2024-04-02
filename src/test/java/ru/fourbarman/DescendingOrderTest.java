package ru.fourbarman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * DescendingOrderTest
 */
class DescendingOrderTest {

    /**
     * When num = 42145 then return 54124.
     */
    @Test
    void sortDescWhen42145() {
        int num = 42145;
        assertEquals(DescendingOrder.sortDesc(num), 54124);
    }

    /**
     * When num = 42145 then return 362541.
     */
    @Test
    void sortDescWhen145263() {
        int num = 145263;
        assertEquals(DescendingOrder.sortDesc(num), 362541);
    }

    /**
     * When num = 42145 then return 987654321.
     */
    @Test
    void sortDescWhen123456789() {
        int num = 123456789;
        assertEquals(DescendingOrder.sortDesc(num), 987654321);
    }

    /**
     * When num = 0 then return 0.
     */
    @Test
    void sortDescWhen0() {
        int num = 0;
        assertEquals(DescendingOrder.sortDesc(num), 0);
    }
}