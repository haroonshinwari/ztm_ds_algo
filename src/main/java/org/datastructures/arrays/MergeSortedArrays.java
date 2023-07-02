package org.datastructures.arrays;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {

        int[] arr2 = {0,3,4,31,75};
        int[] arr1 = {4,6,30,55,56,57,85,93,95};

        //mergeSortedArraysBruteForce(arr1, arr2);

        String answer = Arrays.toString(mergeSortedArraysBruteForce(arr1, arr2));

        System.out.println(answer);
    }

    static int[] mergeSortedArraysBruteForce(int[] array1, int[] array2) {

        int[] emptyArray = new int[array1.length + array2.length];

        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < emptyArray.length; i++) {

            if ( ((index2 > array2.length -1 ) && (index1 < array1.length))
                    && (array1[index1] <= array2[index2]))  {
                emptyArray[i] = array1[index1];
                index1++;
            }else {
                emptyArray[i] = array2[index2];
                index2++;
            }
        }
        return emptyArray;

    }
}
