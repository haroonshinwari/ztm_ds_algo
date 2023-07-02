package org.datastructures.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSumsBruteForce1() {

        int[] nums = {2,7,11,15};
        int target = 9;

        int[] answer = {0,1};

        assertEquals(Arrays.toString(answer), Arrays.toString(TwoSum.twoSumsBruteForce(nums,target)));
    }


    @Test
    void twoSumsBruteForce2() {

        int[] nums2 = {3,2,4};
        int target2 = 6;

        int[] answer2 = {1,2};

        assertEquals(Arrays.toString(answer2), Arrays.toString(TwoSum.twoSumsBruteForce(nums2,target2)));
    }

    @Test
    void twoSumsBruteForce3() {

        int[] nums3 = {3,3};
        int target3 = 6;

        int[] answer3 = {0,1};

        assertEquals(Arrays.toString(answer3), Arrays.toString(TwoSum.twoSumsBruteForce(nums3,target3)));
    }


    @Test
    void twoSumsHashMap1() {

        int[] nums = {2,7,11,15};
        int target = 9;

        int[] answer = {0,1};

        assertEquals(Arrays.toString(answer), Arrays.toString(TwoSum.twoSumsUsingHashmap(nums,target)));
    }


    @Test
    void twoSumsHashMap2() {

        int[] nums2 = {3,2,4};
        int target2 = 6;

        int[] answer2 = {1,2};

        assertEquals(Arrays.toString(answer2), Arrays.toString(TwoSum.twoSumsUsingHashmap(nums2,target2)));
    }

    @Test
    void twoSumsHashMap3() {

        int[] nums3 = {3,3};
        int target3 = 6;

        int[] answer3 = {0,1};

        assertEquals(Arrays.toString(answer3), Arrays.toString(TwoSum.twoSumsUsingHashmap(nums3,target3)));
    }

}