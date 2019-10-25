package com.alevel.arrays.task2;

public class BubbleSortClass {

    public int[] bubbleSort(int array[]) {
        int[] result = new int[array.length];

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.arraycopy(array,0, result, 0, array.length);
        return result;
    }
}
