package com.alevel.arrays.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortClassTest {

    BubbleSortClass bubbleSortClass;
    private static final int FIRST_SIZE = 10;
    private static final int SECOND_SIZE = 6;
    private int firstArray[];
    private int secondArray[];

    @Before
    public void init() {
        bubbleSortClass = new BubbleSortClass();
        firstArray = new int[]{0, 12, -4, 98, -33, 1, 53, 100, -26, 9};
        secondArray = new int[]{-6, -6, -6, -6, -6, -6};
        System.out.println("End of initialization...");
    }

    @Test
    public void bubbleSort() {
        int[] firstArr = bubbleSortClass.bubbleSort(firstArray);
        int[] secondArr = bubbleSortClass.bubbleSort(secondArray);

        Assert.assertEquals(FIRST_SIZE, firstArr.length);
        Assert.assertEquals(SECOND_SIZE, secondArr.length);

        for (int i = 0; i < FIRST_SIZE - 1; i++) {
            Assert.assertTrue(firstArray[i] <= firstArray[i + 1]);
        }

        for (int i = 0; i < SECOND_SIZE - 1; i++) {
            Assert.assertTrue(secondArray[i] <= secondArray[i + 1]);
        }
    }
}