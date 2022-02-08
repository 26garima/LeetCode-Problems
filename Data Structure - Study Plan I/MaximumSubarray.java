// Problem Link : https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i=0;i<nums.length;i++) {
            sum = sum + nums[i];
            result = Math.max(result,sum);
            if(sum < 0)
                sum = 0;
        }
        
        return result;
    }
}

/*
Time Complexity : O(N), where "N" is the length of input array, "nums".
Space Complexity : O(1)
*/
