package org.datastructures.arrays;

import org.junit.jupiter.api.Test;

import static org.datastructures.arrays.MaximumSubarray.maxSubArrayBruteForce;
import static org.datastructures.arrays.MaximumSubarray.maxSubArrayHashmap;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSubArrayTest {

    @Test
    void maximumSubarrayBruteForce1() {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int answer = 6;

        assertEquals(answer, maxSubArrayBruteForce(nums));
    }


    @Test
    void maximumSubarrayBruteForce2() {

        int[] nums = {1};

        int answer = 1;

        assertEquals(answer, maxSubArrayBruteForce(nums));
    }

    @Test
    void maximumSubarrayBruteForce3() {

        int[] nums = {5,4,-1,7,8};

        int answer = 23;

        assertEquals(answer, maxSubArrayBruteForce(nums));
    }


    @Test
    void maximumSubarrayHashMap1() {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int answer = 6;

        assertEquals(answer, maxSubArrayHashmap(nums));
    }


    @Test
    void maximumSubarrayHashMap2() {

        int[] nums = {1};

        int answer = 1;

        assertEquals(answer, maxSubArrayHashmap(nums));
    }

    @Test
    void maximumSubarrayHashMap3() {

        int[] nums = {5,4,-1,7,8};

        int answer = 23;

        assertEquals(answer, maxSubArrayHashmap(nums));
    }

}