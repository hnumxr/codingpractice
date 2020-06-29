/*
Problem URL: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
* Say you have an array prices for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

Example 1:

Input: [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Example 2:

Input: [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
             Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
             engaging multiple transactions at the same time. You must sell before buying again.
Example 3:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.


Constraints:

1 <= prices.length <= 3 * 10 ^ 4
0 <= prices[i] <= 10 ^ 4
*
* */
package LeetCodeArray;

public class LeetCodeBestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        return calculateBase1(prices, 0);
    }

    public int maxProfit2(int[] prices){
        return calculateBase2(prices);
    }

    public int maxProfit3(int[] prices){
        return calculatebase3(prices);
    }

    public int calculateBase1(int[] prices, int s){
        int maxProfit = 0;
        int max = 0;
        for(int start = s; start<prices.length-1; start++){
            for(int i = start+1; i<prices.length; i++){
                if(prices[i]>prices[start]){
                    int profit = prices[i] - prices[start] + calculateBase1(prices, i+1);
                    if(profit > maxProfit){
                        maxProfit = profit;
                    }
                }
            }
            if(maxProfit > max){
                max = maxProfit;
            }
        }
        return max;
    }

    public int calculateBase2(int[] prices){
        int profit = 0;
        boolean buyin = true;
        int valley = 0;
        int peak = 0;
        for(int i=0; i<prices.length; i++) {
            if (i == prices.length - 1) {
                if(!buyin && prices[i] > valley) {
                    peak = prices[i];
                    profit += peak - valley;
                    buyin = false; // completed.
                }
                return profit;
            }
            if (prices[i] < prices[i + 1]) {
                if (buyin) {
                    valley = prices[i];
                    buyin = false;
                    continue;
                } else {
                    continue;
                }
            }
            if (prices[i] > prices[i + 1]) {
                if (buyin) {
                    continue;
                } else if (prices[i] > valley) {
                    peak = prices[i];
                    profit += peak - valley;
                    peak = 0;
                    valley = 0;
                    buyin = true;
                }
            }
        }
        return profit;
    }

    public int calculatebase3(int[] prices){
        int profit = 0;
        for(int i=0; i<prices.length-1; i++)
        {
            if(prices[i]<prices[i+1]){
                profit += prices[i+1] - prices[i];
            }
        }
        return profit;
    }
}