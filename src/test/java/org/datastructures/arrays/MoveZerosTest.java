package org.datastructures.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.datastructures.arrays.MoveZeros.moveZeroesUsingLeftPointer;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveZerosTest {

    @Test
    void moveZeroLeftPointer1() {

        int[] nums = {0,1,0,3,12};
        int[] answer = {1,3,12,0,0};


        assertEquals(Arrays.toString(answer), Arrays.toString(moveZeroesUsingLeftPointer(nums)));
    }

    @Test
    void moveZeroLeftPointer2() {

        int[] nums = {0};
        int[] answer = {0};


        assertEquals(Arrays.toString(answer),Arrays.toString(moveZeroesUsingLeftPointer(nums)));
    }
}
