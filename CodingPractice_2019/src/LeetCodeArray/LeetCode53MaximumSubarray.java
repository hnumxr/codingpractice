/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

 */
package LeetCodeArray;

public class LeetCode53MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int sum=0;
        int record = nums[0];
        int investSum = 0;
        int investCount=0;
        int startIndex=0, endIndex=0;
        for(int i=0; i<nums.length; i++){
            if (nums[i]<0){
                if(sum + nums[i] < 0) {
                    startIndex = i;
                    endIndex = i;
                    sum = nums[i];
                    if(sum>record)
                        record = sum;
                    investCount=0;
                    investSum=0;
                }
                else
                {
                    investSum += nums[i];
                    investCount++;
                    sum += nums[i];
                    if(sum>record)
                        record = sum;
                    endIndex++;
                }
            }
            else {
                if (sum<0)
                    sum = 0;
                if((startIndex == endIndex) && (i > 0) && (nums[i-1]<=0))
                    startIndex = i;
                sum += nums[i];
                if(sum>record)
                    record = sum;
                endIndex++;
                if(investSum<0) {
                    investSum += nums[i];
                    investCount++;
                    if (investSum >= 0) {
                        investSum = 0;
                        investCount = 0;
                    }
                }
            }
            if(i==nums.length-1)
            {
                if(investCount>0){
                    for(int k=0; k<investCount; k++){
                        sum -= nums[i-k];
                    }
                }
            }
        }
        if(sum>record)
            record = sum;
        return record;
    }

    public int maxSubArrayBase(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int sum=nums[0];
        int max=nums[0];
        for(int i=0; i<nums.length; i++){
            sum=nums[i];
            if(sum>max)
                max=sum;
            for(int j=i+1; j<nums.length;j++)
            {
                sum+= nums[j];
                if(sum>max)
                    max=sum;
            }
        }
        if(sum>max)
            max=sum;
        return max;
    }

    public int learn1(int[] nums) {
        // formula: dp[i] = max(nums[i], nums[i] + dp[i+1])
        // noticed we do not need to keep dp[i] other than the max, so use a tmp variable
        // {-2,1,-3,4,0,-1,2,1,-5,8,-3,5}
        int tmp = nums[nums.length-1];
        int res = tmp;
        for(int i=nums.length-2; i>=0; i--) {
            tmp = Math.max(nums[i], nums[i] + tmp);
            res = Math.max(res, tmp);
        }
        return res;
    }

    public int changefromlearn1(int[] nums) {
        // formula: dp[i] = max(nums[i], nums[i] + dp[i+1])
        // noticed we do not need to keep dp[i] other than the max, so use a tmp variable
        // {-2,1,-3,4,0,-1,2,1,-5,8,-3,5}
        int tmp = nums[0];
        int res = tmp;
        for(int i=1; i<nums.length; i++) {
            tmp = Math.max(nums[i], nums[i] + tmp);
            res = Math.max(res, tmp);
        }
        return res;
    }
}
