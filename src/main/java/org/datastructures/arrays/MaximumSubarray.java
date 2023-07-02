package org.datastructures.arrays;

import java.util.*;

public class MaximumSubarray {

/* Given an integer array nums, find the subarray with the largest sum, and return its sum.
*
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
*
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
*
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
* */


    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int[] nums2 = {1};

        int[] nums3 = {5,4,-1,7,8};

        //***check if you can pass empty array

        System.out.println(maxSubArrayBruteForce(nums));
        System.out.println(maxSubArrayBruteForce(nums2));
        System.out.println(maxSubArrayBruteForce(nums3));

        System.out.println(maxSubArrayHashmap(nums));

    }

    //0(N^2) N-Squared solution  - looping through two arrays
    public static int maxSubArrayBruteForce(int[] nums) {

        //Hashmap that stores subarrays with key as total sum and value as subarray
        HashMap<Integer, int[]> myHashmap = new HashMap<>();

        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j <nums.length ; j++) {
                int[] cumulativeArray = Arrays.copyOfRange(nums, i, j+1);
                int sum = Arrays.stream(cumulativeArray).sum();
                myHashmap.put(sum, cumulativeArray);
            }
        }

        Set<Integer> sumValues = myHashmap.keySet();
        return Collections.max(sumValues);
    }


    //Linear solution 0 (n) -- Remove negative prefix ""Sliding window" - 0(n)
    public static int maxSubArrayHashmap(int[] nums) {

        int maxSub = nums[0];
        int currentSum= 0;

        for (int num : nums) {

            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum += num;
            maxSub = Math.max(maxSub, currentSum);
        }

        return maxSub;

    }

}
