/*
Plus One

https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/

Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
 */

public class LeetCodePlusOne {
    public int[] plusOne(int[] digits) {
        int[] res;

        if(needOneMoreDigit(digits)){
            res = new int[digits.length+1];
            res[0] = 1;
            for (int i = 1; i<res.length; i++){
                res[i] = 0;
            }
        }
        else {
            res = new int[digits.length];
            int addOne = 1;
            for (int i = res.length-1; i>=0; i--){
                if(addOne == 1) {
                    res[i] = plusOne(digits[i]);
                    if (res[i] != 0)
                        addOne = 0;
                }
                else
                    res[i] = digits[i];
            }
        }

        return res;
    }

    private int plusOne(int digit){
        if(digit == 9)
            return 0;
        else
            return digit+1;
    }

    private boolean needOneMoreDigit(int[] digits){
        for(int i=0; i<digits.length; i++){
            if(digits[i] != 9){
                return false;
            }
        }
        return true;
    }
}
