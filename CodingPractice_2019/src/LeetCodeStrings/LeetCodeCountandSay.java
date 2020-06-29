/*
    Count and Say
    https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/886/

   The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.

Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
You can do so recursively, in other words from the previous member read off the digits,
counting the number of digits in groups of the same digit.

Note: Each term of the sequence of integers will be represented as a string.



Example 1:

Input: 1
Output: "1"
Explanation: This is the base case.
Example 2:

Input: 4
Output: "1211"
Explanation: For n = 3 the term was "21" in which we have two groups "2" and "1", "2" can
be read as "12" which means frequency = 1 and value = 2, the same way "1" is read as "11",
so the answer is the concatenation of "12" and "11" which is "1211".
   Hide Hint #1
The following are the terms from n=1 to n=10 of the count-and-say sequence:
 1.     1
 2.     11
 3.     21
 4.     1211
 5.     111221
 6.     312211
 7.     13112221
 8.     1113213211
 9.     31131211131221
10.     13211311123113112211
   Hide Hint #2
To generate the nth term, just count and say the n-1th term.
 */
package LeetCodeStrings;

public class LeetCodeCountandSay {
    public String countAndSay(int n) {
        if(n == 1)
            return Integer.toString(1);
        if(n == 2)
            return Integer.toString(11);
        if(n == 3)
            return Integer.toString(21);
        String pre = countAndSay(n-1);
        String res = "";
        int c = 1;
        for(int i = 0; i<pre.length(); i++){
            if(i == pre.length() - 1){
                res += Integer.toString(c) + pre.charAt(i);
                break;
            }
            if(pre.charAt(i) == pre.charAt(i+1)) {
                c++;
                continue;
            }
            else {
                res += Integer.toString(c) + pre.charAt(i);
                c = 1;
            }
        }
        return res;
    }

}
