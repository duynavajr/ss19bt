package org.example.bt4;

public class FindMax {
    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("The input array must not be null or empty");
        }

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }


/** Copyright belong to Rikkei Academy*/

}
