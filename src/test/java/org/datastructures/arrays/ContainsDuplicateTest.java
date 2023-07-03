package org.datastructures.arrays;

import org.junit.jupiter.api.Test;

import static org.datastructures.arrays.ContainsDuplicate.containsDuplicateBruteForce;
import static org.datastructures.arrays.ContainsDuplicate.containsDuplicateHashSet;
import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void containsDuplicateBruteForce1() {

        int[] nums =  {1,2,3,1};
        assertTrue(containsDuplicateBruteForce(nums));
    }

    @Test
    void containsDuplicateBruteForce2() {

        int[] nums2 = {1,2,3,4};
        assertFalse(containsDuplicateBruteForce(nums2));
    }

    @Test
    void containsDuplicateBruteForce3() {

        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
        assertTrue(containsDuplicateBruteForce(nums3));
    }

    @Test
    void containsDuplicateHashSet1() {

        int[] nums =  {1,2,3,1};
        assertTrue(containsDuplicateHashSet(nums));
    }

    @Test
    void containsDuplicateHashSet2() {

        int[] nums2 = {1,2,3,4};
        assertFalse(containsDuplicateHashSet(nums2));
    }

    @Test
    void containsDuplicateHashSet3() {

        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
        assertTrue(containsDuplicateHashSet(nums3));
    }
}