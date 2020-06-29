import java.util.HashSet;
import java.util.Set;

/*
Valid Sudoku
https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/769/

Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.

A partially filled sudoku which is valid.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.

Example 1:

Input:
[
  ["5","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]
Output: true
Example 2:

Input:
[
  ["8","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]
Output: false
Explanation: Same as Example 1, except with the 5 in the top left corner being
    modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
The given board contain only digits 1-9 and the character '.'.
The given board size is always 9x9.
 */
public class LeetCodeValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        char[] c = new char[9];
        int k = 0;
        for(int i = 0; i<9; i++){
            if(hasDuplicate(board[i]))
                return false;
        }
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                c[j] = board[j][i];
            }
            if(hasDuplicate(c))
                return false;
        }
        for(int subboxRow = 0; subboxRow<3; subboxRow++) {
            for(int subboxColumn = 0; subboxColumn<3; subboxColumn++){
                k=0;
                for(int i = 0; i<3; i++){
                    for(int j = 0; j<3; j++){
                        c[k++] = board[i+3*subboxRow][j+3*subboxColumn];
                    }
                }
                if(hasDuplicate(c))
                    return false;
            }
        }

        return true;
    }

    private boolean hasDuplicate(char[] ar){
        Set<Character> set = new HashSet<>();
        for(int i = 0; i<9; i++){
            if(ar[i] != '.' && set.contains(ar[i]))
                return true;
            else
                set.add(ar[i]);
        }
        return false;
    }
}
