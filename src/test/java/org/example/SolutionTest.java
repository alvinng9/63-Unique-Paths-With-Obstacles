package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void uniquePathsWithObstaclesTest() {
        Solution solution = new Solution();
        int[][] inputOne = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        assertEquals(2, solution.uniquePathsWithObstacles(inputOne));

        int[][] inputTwo = {
                {0,1},
                {0,0},
        };
        assertEquals(1, solution.uniquePathsWithObstacles(inputTwo));

        int[][] inputThree = {
                {0,0},
                {0,1},
        };
        assertEquals(0, solution.uniquePathsWithObstacles(inputThree));

        int[][] inputFour = {
                {0,0},
                {1,1},
                {0,0}
        };
        assertEquals(0, solution.uniquePathsWithObstacles(inputFour));
    }

}