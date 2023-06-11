package org.example;

import java.util.Arrays;

public class Scrap {

    public static void main(String[] args) {

        int[] nums = {5,4,21,8,4,6,3};

        System.out.println(nums[1]);

        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 3, 6)));

        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 2, 3)));

        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, 1)));


    }
}
