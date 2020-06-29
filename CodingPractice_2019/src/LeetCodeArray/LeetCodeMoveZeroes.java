/*
Move Zeroes
https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */

import java.util.Arrays;

public class LeetCodeMoveZeroes {
    public void moveZeroesbase(int[] nums) {
        int zero = 0 ;
        for(int i=0; i<nums.length - zero; i++)
        {
            if(nums[i] == 0){
                nums = move(nums, i);
                zero++;
                i--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public void moveZerosAdvanced(int[] nums){
        int lastNoneZeroElementIndex = 0;
        for(int i = 0; i<nums.length; i++){
            if (nums[i] != 0){
                nums[lastNoneZeroElementIndex++] = nums[i];
            }
        }
        for(int i = lastNoneZeroElementIndex; i<nums.length; i++){
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    public void moveZerosAdvanced2(int[] nums){
        int lastNoneZeroElementIndex = 0;
        for(int cur = 0; cur<nums.length; cur++){
            if(nums[cur] != 0)
            {
                swap(nums, lastNoneZeroElementIndex++, cur);
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private int[] move(int[] nums, int i){
        int temp;
        while(i<nums.length-1) {
            nums[i] = nums[i+1];
            i++;
        }
        nums[nums.length-1] = 0;
        return nums;
    }
}
