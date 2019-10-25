package com.alevel.arrays.task3;

public class MultipleNumbersArray {

    public int[] getMultipleNumbers(int k, int[] array) {
        if (k == 0) {
            return new int[0];
        }

        int[] tmp = new int[array.length];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                continue;
            if (array[i] % k == 0) {
                tmp[counter] = array[i];
                counter++;
            }
        }
        int[] result = new int[counter];
        System.arraycopy(result, 0, tmp, 0, counter);
        return result;
    }
}
