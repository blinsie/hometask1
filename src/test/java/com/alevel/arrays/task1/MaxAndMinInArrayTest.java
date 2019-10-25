package com.alevel.arrays.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class MaxAndMinInArrayTest {

    MaxAndMinInArray maxAndMinInArray;
    private int firstArray[];
    private int secondArray[];
    private int thirdArray[];

    @Before
    public void init() {
        maxAndMinInArray = new MaxAndMinInArray();
        firstArray = new int[]{0, 12, -4, 98, -33, 1, 53, 100, -26, 9};
        secondArray = new int[]{87, -5, 66, 92, -11, 92, -8, -11};
        thirdArray = new int[]{-6, -6, -6, -6, -6, -6};
    }

    @Test
    public void findMaximumElementTest() {
        Assert.assertEquals(100, maxAndMinInArray.findMaximumElement(firstArray));
        Assert.assertEquals(92, maxAndMinInArray.findMaximumElement(secondArray));
        Assert.assertEquals(-6, maxAndMinInArray.findMaximumElement(thirdArray));
    }


    @Test
    public void findMinimumElementTest() {
        Assert.assertEquals(-33, maxAndMinInArray.findMinimumElement(firstArray));
        Assert.assertEquals(-11, maxAndMinInArray.findMinimumElement(secondArray));
        Assert.assertEquals(-6, maxAndMinInArray.findMinimumElement(thirdArray));
    }
}