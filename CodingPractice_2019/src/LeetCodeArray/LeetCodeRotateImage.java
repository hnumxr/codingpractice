package LeetCodeArray;

/*
Rotate Image
https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/770/

You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Note:

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Example 1:

Given input matrix =
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

rotate the input matrix in-place such that it becomes:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]
Example 2:

Given input matrix =
[
  [ 5, 1, 9,11],
  [ 2, 4, 8,10],
  [13, 3, 6, 7],
  [15,14,12,16]
],

rotate the input matrix in-place such that it becomes:
[
  [15,13, 2, 5],
  [14, 3, 4, 1],
  [12, 6, 8, 9],
  [16, 7,10,11]
]
 */
public class LeetCodeRotateImage {
    public void rotate(int[][] matrix) {
        int levelNum = matrix.length/2;
        for(int l = 0; l<levelNum; l++) {
            for (int i = l; i < matrix.length - l - 1; i++) {
                rotatePoint(matrix, l, i, matrix.length-1);
            }
        }
    }

    private void rotatePoint(int[][] matrix, int row, int column, int len){
        int temp;
        int pre;

        temp = matrix[column][len - row];
        matrix[column][len - row] = matrix[row][column];

        pre = temp;
        temp = matrix[len - row][len - column];
        matrix[len - row][len - column] = pre;

        pre = temp;
        temp = matrix[len - column][row];
        matrix[len - column][row] = pre;

        matrix[row][column] = temp;
    }
}
