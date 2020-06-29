/*
Two Sum
https://leetcode.com/articles/two-sum/

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

import java.util.HashMap;
import java.util.Map;

public class LeetCodeTwoSum {
    public int[] twoSumBase(int[] nums, int target) {
        int[] res = new int[]{-1,-1};
        outerloop:
        for(int i = 0; i<nums.length-1; i++) {
            res[0] = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    res[1] = j;
                    break outerloop;
                }
            }
        }
        return res;
    }

    public int[] twoSumAdvanced(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int complement;
        int[] res = new int[]{-1,-1};

        for(int i = 0; i< nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i = 0; i<nums.length; i++){
            complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                res[0] = i;
                res[1] = map.get(complement);
                break;
            }
        }
        return res;
    }

    public int[] twoSumAdvanced2(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[]{-1, -1};

        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])){
                res[0] = map.get(target - nums[i]);
                res[1] = i;
            }
            else
                map.put(nums[i], i);
        }
        return res;
    }
}
