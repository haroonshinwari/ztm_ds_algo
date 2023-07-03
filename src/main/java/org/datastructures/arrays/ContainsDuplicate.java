package org.datastructures.arrays;


import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * Example 1: True
 * nums = [1,2,3,1]
 * Example 2: False
 * nums = [1,2,3,4]
 * Example 3: True
 * [1,1,1,3,3,4,3,2,4,2]
 */
public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] nums =  {1,2,3,1};
        int[] nums2 = {1,2,3,4};
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicateBruteForce(nums));
        System.out.println(containsDuplicateBruteForce(nums2));
        System.out.println(containsDuplicateBruteForce(nums3));

        System.out.println(containsDuplicateHashSet(nums2));
    }

    static boolean containsDuplicateBruteForce(int[] nums) {

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }


    static boolean containsDuplicateHashSet(int[] nums) {

        //Create hashset to store integers
        Set<Integer> intSet = new HashSet<>();

        //Iterate over each element
        for (int num : nums) {

            //Check the number is in hashset
            if (intSet.contains(num)) {
                return true;
            }

            //Add the number to the hashset
            intSet.add(num);
        }

        return false;
    }

}
