/*
Single Number   https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/

Solution
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeetCodeSingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x: nums){
            if(set.contains(x))
                set.remove(x);
            else
                set.add(x);
        }
        if(set.size() != 0)
            return set.stream().findFirst().get();
        else
            return -1;
    }

    public int singleNumberApproch2(int[] nums) {
        HashMap<Integer, Integer> hash_table = new HashMap<>();

        for (int i : nums) {
            hash_table.put(i, hash_table.getOrDefault(i, 0) + 1); // How will it be if inputlist contains 0?
        }
        for (int i : nums) {
            if (hash_table.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }

    public int singleNumberBitManipulation(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }
}
