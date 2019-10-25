package com.alevel.arrays.task3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MultipleNumbersArrayTest {

    MultipleNumbersArray multipleNumbersArray;
    private int firstArray[];
    private int secondArray[];

    @Before
    public void init() {
        multipleNumbersArray = new MultipleNumbersArray();
        firstArray = new int[]{0, 12, -4, 98, -33, 1, 53, 100, -26, 9};
        secondArray = new int[]{-6, -6, -6, -6, -6, -6};
    }

    @Test
    public void getMultipleNumbers() {
        Assert.assertEquals(0, multipleNumbersArray.getMultipleNumbers(0, firstArray).length);
        int[] arrayMod2 = multipleNumbersArray.getMultipleNumbers(2, firstArray);
        Assert.assertEquals(5, arrayMod2.length);

        for (int i = 0; i < arrayMod2.length; i++) {
            Assert.assertTrue(arrayMod2[i] % 2 == 0);
        }

        int[] arrayMod6 = multipleNumbersArray.getMultipleNumbers(6, secondArray);
        Assert.assertEquals(6, arrayMod6.length);

        for (int i = 0; i < arrayMod6.length; i++) {
            Assert.assertTrue(arrayMod6[i] % 2 == 0);
        }
    }
}