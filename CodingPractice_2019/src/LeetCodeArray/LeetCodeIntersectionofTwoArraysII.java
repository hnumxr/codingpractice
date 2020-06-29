/*
Intersection of Two Arrays II  https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Note:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:

What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

 */

import java.util.ArrayList;
import java.util.List;


public class LeetCodeIntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> resList = new ArrayList<Integer>();
        int[] res;
        if (nums1.length <= nums2.length) {
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j]) {
                        resList.add(nums1[i]);
                        nums2[j] = -1;
                        break;
                    }
                }
            }
        }
        if (nums1.length > nums2.length) {
            for (int i = 0; i < nums2.length; i++) {
                for (int j = 0; j < nums1.length; j++) {
                    if (nums2[i] == nums1[j]) {
                        resList.add(nums2[i]);
                        nums1[j] = -1;
                        break;
                    }
                }
            }
        }
        res = new int[resList.size()];
        Integer[] temp = resList.toArray(new Integer[resList.size()]);
        for (int n = 0; n < resList.size(); ++n) {
            res[n] = temp[n];
        }
        return res;
    }
}
