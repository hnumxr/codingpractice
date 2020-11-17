/*
Valid Palindrome
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 */
package LeetCodeStrings;

public class LeetCodeValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.isEmpty() || s.isEmpty() || s == null || s.length() == 0 || s.length() == 1)
            return true;
        for(int i=0, j = s.length()-1; i<=j; ){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(!(Character.isLetter(c1) || Character.isDigit(c1))) {
                i++;
                continue;
            }
            if(!(Character.isLetter(c2) || Character.isDigit(c2))) {
                j--;
                continue;
            }
            if(c1 == c2 || Character.toLowerCase(c1) == Character.toLowerCase(c2)){
                i++;
                j--;
            }
            else
                return false;
        }

        return true;
    }
}
