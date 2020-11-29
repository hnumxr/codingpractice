/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/96/sorting-and-searching/587/
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]


Constraints:

-10^9 <= nums1[i], nums2[i] <= 10^9
nums1.length == m + n
nums2.length == n
   Hide Hint #1
You can easily solve this problem if you simply think about two elements at a time rather than two arrays. We know that each of the individual arrays is sorted. What we don't know is how they will intertwine. Can we take a local decision and arrive at an optimal solution?
   Hide Hint #2
If you simply consider one element each at a time from the two arrays and make a decision and proceed accordingly, you will arrive at the optimal solution.
 */

package LeetCodeSortingandSearching;

public class MergeSortedArray
{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c = 0; // already compared index in nums1;
        for(int i = 0; i < n; i++){ // nums2 loop from 0;
            if(c==m){
                nums1[c] = nums2[i];
                c++;
                m++;
            }
            for(int j = c; j < m; j++){ // nums1 loop from c;
                if(nums2[i] < nums1[j]){
                    // insert nums2[i] before nums1[j]
                    int k = 0; // inserting index.
                    do{
                        nums1[m - k] = nums1[m - k - 1];
                        k++;

                    }while (m-k>j);
                    nums1[j] = nums2[i];
                    m++;
                    c = j+1;
                    break;
                }
                else if(j == m-1){
                    nums1[j+1] = nums2[i];
                    m++;
                    c = j+2;
                    break;
                }
            }
        }
    }
}
