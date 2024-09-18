package org.example;

public class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        //create a new 2d array with the same dimensions as the given 2d array
        int[][] path = new int[m][n];

        //work backward and assign 1 to value on the right side of the matrix
        //until a value of 1 appears
        for (int i = m - 1; i >= 0; i--) {
            if (grid[i][n - 1] == 1) {
                break;
            } else {
                path[i][n - 1] = 1;
            }
        }

        //work backward and assign 1 to value on the bottom of the matrix
        //until a value of 1 appears
        for (int i = n - 1; i >= 0; i--) {
            if (grid[m - 1][i] == 1) {
                break;
            } else {
                path[m - 1][i] = 1;
            }
        }

        //work backward from the bottom right corner of the matrix
        //add up from two adjacent indexes on the right and bottom
        //until the top left corner
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                if (grid[i][j] == 1) {
                    path[i][j] = 0;
                } else {
                    path[i][j] = path[i + 1][j] + path[i][j + 1];
                }
            }
        }

        //return value of the top left corner
        return path[0][0];
    }
}
