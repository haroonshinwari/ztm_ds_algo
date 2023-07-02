package org.datastructures.arrays;

import java.util.Arrays;

public class MoveZeros {

    /**
     * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     * Note that you must do this in-place without making a copy of the array.
     * Example 1:
     *  Input: nums = [0,1,0,3,12]
     *  Output: [1,3,12,0,0]
     *Example 2:
     *  Input: nums = [0]
     *  Output: [0]
     */

    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};
        int[] nums2 = {0};

        System.out.println(Arrays.toString(moveZeroesUsingLeftPointer(nums)));

        System.out.println(Arrays.toString(moveZeroesUsingLeftPointer(nums2)));

    }



    //0(n) solution use left pointer to keep track of index for non zero values

    // Do nothing when you come across a zero
    //when you see a non-zero, add it to the index of left pointer and increment left pointer by 1 and set current index value to 0
    public static int[]  moveZeroesUsingLeftPointer(int[] nums) {

        int leftPointer = 0;

        if (nums.length == 1) {
            return nums;
        }

        for (int i=0; i < nums.length; i++) {
            if (nums[i] != 0 ) {
                nums[leftPointer] = nums[i] ;
                nums[i] = 0;
                leftPointer++;

            }
        }

        return nums;
    }



}
