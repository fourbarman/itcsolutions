package ru.fourbarman;

/**
 * DescendingOrder.
 */
public class DescendingOrder {
    /**
     * Reverse int number.
     */
    public static int sortDesc(final int num) {
        int reverse = 0;
        int numCopy = num;
        while (numCopy != 0) {
            int remainder = numCopy % 10;
            reverse = reverse * 10 + remainder;
            numCopy = numCopy / 10;
        }
        return reverse;
    }
}

