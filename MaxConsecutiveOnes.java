// Problem Link : https://leetcode.com/problems/max-consecutive-ones/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int n = nums.length;
        int count = 0;
        
        for(int i=0;i<n;i++) {
            if(nums[i] == 0)
                count = 0;
            else {
                count++;
                result = Math.max(result,count);
            }
        }
        
        return result;
    }
}

/*
Time Complexity : O(N), where "N" is the length of input array, "nums".
Space Complexity : O(1)
*/
