/*

https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/

Given an array, rotate the array to the right by k steps, where k is non-negative.

Follow up:

Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Could you do it in-place with O(1) extra space?


Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]


Constraints:

1 <= nums.length <= 2 * 10^4
It's guaranteed that nums[i] fits in a 32 bit-signed integer.
k >= 0
   Hide Hint #1
The easiest solution would use additional memory and that is perfectly fine.
   Hide Hint #2
The actual trick comes when trying to solve this problem without using any additional memory.
This means you need to use the original array somehow to move the elements around. Now, we can
place each element in its original location and shift all the elements around it to adjust as
that would be too costly and most likely will time out on larger input arrays.
   Show Hint #3

   One line of thought is based on reversing the array (or parts of it) to obtain the desired result.
   Think about how reversal might potentially help us out by using an example.
   Hide Hint #4
The other line of thought is a tad bit complicated but essentially it builds on the idea of placing
each element in its original position while keeping track of the element originally in that position.
Basically, at every step, we place an element in its rightful position and keep track of the element
already there or the one being overwritten in an additional variable. We can't do this in one linear
pass and the idea here is based on cyclic-dependencies between elements.
 */

public class LeetCodeRotateArray {
    public void rotatebase(int[] nums, int k) {
        int t = nums[0];
        int t2 = nums[0];
        k %= nums.length;
        for(int i = 0; i<k; i++){
            for(int j = 0; j<nums.length; j++){
                if(j+1 >= nums.length)
                {
                    nums[0] = t;
                    break;
                }
                t = nums[j+1];
                nums[j+1] = t2;
                t2 = t;
            }
        }
    }

    public void rotateadvanced(int[] nums, int k) {
        int count = 0;
        int previousVal;
        int next=0;
        int temp;
        int start;
        int current;
        k %= nums.length;

        for(int i= 0; count < nums.length; i++){
            start = i;
            previousVal = nums[start];
            current = start;
            do{
                next = (current+k)%nums.length;
                temp = nums[next];
                nums[next] = previousVal;
                previousVal = temp;
                current = next;
                count++;
            } while (next != start);
        }
    }
}
