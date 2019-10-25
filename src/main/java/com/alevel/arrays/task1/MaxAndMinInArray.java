package com.alevel.arrays.task1;

public class MaxAndMinInArray {

    public int findMaximumElement(int[] array) {
        int result = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] >= result) {
                result = array[i];
            }
        }

        return result;
    }

    public int findMinimumElement(int[] array) {
        int result = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= result) {
                result = array[i];
            }
        }

        return result;
    }
}
