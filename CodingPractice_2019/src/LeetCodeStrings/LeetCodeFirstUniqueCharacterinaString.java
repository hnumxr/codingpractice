/*
First Unique Character in a String
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase English letters.
 */

package LeetCodeStrings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LeetCodeFirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for(int i = 0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.replace(s.charAt(i), -1);
            }
            else
                map.put(s.charAt(i), i);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() != -1)
                return entry.getValue();
        }
        return -1;
    }

    public int firstUniqCharBase2(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
