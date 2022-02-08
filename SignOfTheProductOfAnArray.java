// Problem Link : https://leetcode.com/problems/sign-of-the-product-of-an-array/

class Solution {
    public int arraySign(int[] nums) {
        
        int ifZero = 0;
        int negativeCount = 0;
        
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0)
                ifZero = 1;
            if(nums[i] < 0)
                negativeCount += 1;
        }
        
        if(ifZero == 1)
            return 0;
        if(negativeCount%2 == 0) 
            return 1;
        return -1;
    }
}

/*
Time Complexity : O(N), where "N" is the length of input array, "nums".
Space Complexity : O(1)
*/
