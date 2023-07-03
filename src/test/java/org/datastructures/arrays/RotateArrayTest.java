package org.datastructures.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.datastructures.arrays.RotateArray.rotateArrayBruteForce;
import static org.datastructures.arrays.RotateArray.rotateUsingReverse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateArrayTest {

    @Test
    void rotateArrayBruteForce1() {

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int[] answer = {5,6,7,1,2,3,4};

        assertEquals(Arrays.toString(answer), Arrays.toString(rotateArrayBruteForce(nums,k)));
    }

    @Test
    void rotateArrayBruteForce2() {

        int[] nums = {-1,-100,3,99};
        int k = 2;
        int[] answer = {3,99,-1,-100};

        assertEquals(Arrays.toString(answer),Arrays.toString(rotateArrayBruteForce(nums,k)));
    }

    @Test
    void rotateArrayUsingReverse1() {

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int[] answer = {5,6,7,1,2,3,4};

        assertEquals(Arrays.toString(answer), Arrays.toString(rotateUsingReverse(nums,k)));
    }

    @Test
    void rotateArrayUsingReverse2() {

        int[] nums = {-1,-100,3,99};
        int k = 2;
        int[] answer = {3,99,-1,-100};

        assertEquals(Arrays.toString(answer),Arrays.toString(rotateUsingReverse(nums,k)));
    }


}
