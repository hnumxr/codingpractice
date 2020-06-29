/*
Valid Anagram
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/

Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */

package LeetCodeStrings;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeValidAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }
        return mapS.equals(mapT);
    }
}

