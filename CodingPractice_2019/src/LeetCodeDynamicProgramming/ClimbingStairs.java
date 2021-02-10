/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/569/

Climbing Stairs

Solution
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

Constraints:
1 <= n <= 45

   Hide Hint #1
To reach nth step, what could have been your previous steps? (Think about the step sizes)

 */
package LeetCodeDynamicProgramming;

public class ClimbingStairs {
    public int climbStairs(int n) {
        //return climStairsApproach1(0,n);
        return climbStairsApproach2(0, n, new int[n+1]);
    }

    private int climStairsApproach1(int i, int n){
        if(i==n){
            return 1;
        }
        if(i>n){
            return 0;
        }
        return climStairsApproach1(i+1, n) + climStairsApproach1(i+2, n);
    }

    private int climbStairsApproach2(int i, int n, int[] mem){
        if(i==n){
            return 1;
        }
        if(i>n){
            return 0;
        }
        if(mem[i] > 0)
        {
            return mem[i];
        }
        mem[i] = climbStairsApproach2(i+1, n, mem) + climbStairsApproach2(i+2, n, mem);
        return mem[i];
    }
}
