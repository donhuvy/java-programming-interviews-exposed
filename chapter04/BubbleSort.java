package com.wiley.javainterviewexposed.chapter04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSort {

    public void bubbleSort(int[] numbers) {
        boolean numbesSwitched;
        do {
            numbesSwitched = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i + 1] < numbers[i]) {
                    int tmp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = tmp;
                    numbesSwitched = true;
                }
            }
        } while (numbesSwitched);
    }

    @Test
    public void testBuble() {
        final int[] numbers = {6, 4, 9, 5};
        final int[] expected = {4, 5, 6, 9};
        bubbleSort(numbers);
        assertArrayEquals(expected, numbers);
    }

}
