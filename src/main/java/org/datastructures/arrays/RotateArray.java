package org.datastructures.arrays;


import java.util.Arrays;

/**
 * LeetCode 189: Rotate Array
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 *
 */
public class RotateArray {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        System.out.println(Arrays.toString(rotateArrayBruteForce(nums, k)));


        int[] nums2 = {-1,-100,3,99};
        int k2 = 2;

        System.out.println(Arrays.toString(rotateArrayBruteForce(nums2, k2)));

    }

    static int[] rotateArrayBruteForce(int[] nums, int k) {

        int[] firstHalfArray  = new int[nums.length - k];
        int[] secondHalfArray  = new int[k];

        if (nums.length - k >= 0) System.arraycopy(nums, 0, firstHalfArray, 0, nums.length - k);

        int counter = 0;

        for (int i = nums.length-k; i < nums.length; i++) {
            secondHalfArray[counter] = nums[i];
            counter++;
        }

        int firstArrayLength = firstHalfArray.length;
        int secondArrayLength = secondHalfArray.length;

        int[] result = new int[firstArrayLength + secondArrayLength];

        System.arraycopy(secondHalfArray,0,result,0,secondArrayLength);
        System.arraycopy(firstHalfArray,0,result,secondArrayLength,firstArrayLength);

        return result;

    }




    static int[] rotateUsingReverse(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length -1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length -1);

        return nums;
    }

    static void reverse(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
}
