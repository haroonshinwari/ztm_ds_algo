package org.datastructures.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


/*    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.*/

    /*
    Example 1
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    Example 2
    Input: nums = [3,2,4], target = 6
    Output: [1,2]

    Example 3
    Input: nums = [3,3], target = 6
    Output: [0,1]
     */

    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSumsBruteForce(nums, target)));

        int[] nums2 = {3,2,4};
        int target2 = 6;
       System.out.println(Arrays.toString(twoSumsBruteForce(nums2, target2)));

        int[] nums3 = {3,3};
        int target3 = 6;
        System.out.println(Arrays.toString(twoSumsBruteForce(nums3, target3)));

    }

    static int[] twoSumsBruteForce(int[] nums, int target) {

        int[] solution = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i]+ nums[j] == target) {
                    solution[0]= i;
                    solution[1] = j;
                    return solution;
                }
            }
        }
        return solution;
    }


    static int[] twoSumsUsingHashmap(int[] nums, int target) {

        //This hashmap will contain keys as complements(array values) and value as the index in the array
        Map<Integer, Integer> valueAndIndexHashmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            //calculate complement first
            int complement = target - nums[i];

            if (valueAndIndexHashmap.containsKey(complement)) {
                return new int[]{valueAndIndexHashmap.get(complement), i};
            }
            valueAndIndexHashmap.put(nums[i], i);
            }
        return null;
    }
}
