/*
Longest Common Prefix
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/887/

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.


 */
package LeetCodeStrings;

public class LeetCodeLongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        int len = strs.length;
        if (len == 1)
            return strs[0];
        int k=0;
        for(int i = 1; i < len; i++){
            if((i==1 && k>strs[i-1].length() -1) || k > strs[i].length() - 1){
                break;
            }
            if(strs[i].charAt(k) == strs[i-1].charAt(k)){
                if (i == len-1){
                    res += strs[i].charAt(k);
                    k++;
                    i=0;
                }
                continue;
            }
            else break;
        }
        return res;
    }

    // Learn from leetcode solution 4.
    public String longestCommonPrefixBinaryTree(String[] strs){
        if (strs == null || strs.length == 0)
            return "";
        int minLen = Integer.MAX_VALUE;
        for (String str : strs)
            minLen = Math.min(minLen, str.length());
        int low = 1;
        int high = minLen;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (isCommonPrefix(strs, middle))
                low = middle + 1;
            else
                high = middle - 1;
        }
        return strs[0].substring(0, (low + high) / 2);
    }

    private boolean isCommonPrefix(String[] strs, int len){
        String str1 = strs[0].substring(0,len);
        for (int i = 1; i < strs.length; i++)
            if (!strs[i].startsWith(str1))
                return false;
        return true;
    }

}

