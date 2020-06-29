/*
Reverse Integer
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within
the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem,
assume that your function returns 0 when the reversed integer overflows.
 */
package LeetCodeStrings;

import java.util.*;

public class LeetCodeReverseInteger {

    // Use ArrayList to implement it.
    // One concern is ArrayList doesn't maintain the order of the elements.
    public int reverse(int x) {
        if((x > Math.pow(2,31) - 1) || (x < -Math.pow(2, 31)))
            return 0;
        List<Integer> list = new ArrayList<Integer>();
        int reversedNum = 0;
        do{
            list.add(x%10);
            x /= 10;
        } while (x>1 || x<-1);
        if(x!=0)
            list.add(x%10);

        for(int i = 0; i<list.size(); i++){
            reversedNum += list.get(i) * Math.pow(10, list.size() - i -1);
        }
        if((reversedNum >= Math.pow(2,31) - 1) || (reversedNum <= -Math.pow(2, 31)))
            return 0;
        return reversedNum;
    }

    // Use deque to implement it.
    public int reverseAdvanced(int x){
        if((x > Math.pow(2,31) - 1) || (x < -Math.pow(2, 31)))
            return 0;
        Deque<Integer> dq = new ArrayDeque<Integer>();
        int reversedNum = 0;
        do{
            dq.push(x%10);
            x /= 10;
        } while (x>1 || x<-1);
        if(x!=0)
            dq.push(x%10);

        int size = dq.size();
        for(int i = 0; i<size; i++){
            reversedNum += dq.pollLast() * Math.pow(10, size - i -1);
        }
        if((reversedNum >= Math.pow(2,31) - 1) || (reversedNum <= -Math.pow(2, 31)))
            return 0;
        return reversedNum;
    }

    // use stack to implement it.
    public int reverseAdvanced2(int x){
        if((x > Math.pow(2,31) - 1) || (x < -Math.pow(2, 31)))
            return 0;
        Stack<Integer> stack = new Stack<Integer>();
        int reversedNum = 0;
        do{
            stack.push(x%10);
            x /= 10;
        } while (x>1 || x<-1);
        if(x!=0)
            stack.push(x%10);

        int size = stack.size();
        for(int i = 0; i<size; i++){
            reversedNum += stack.elementAt(i) * Math.pow(10, size - i -1);
        }
        if((reversedNum >= Math.pow(2,31) - 1) || (reversedNum <= -Math.pow(2, 31)))
            return 0;
        return reversedNum;
    }
}
