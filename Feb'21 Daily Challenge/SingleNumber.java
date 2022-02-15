// Problem. Link : https://leetcode.com/problems/single-number/

class Solution {
    public int singleNumber(int[] nums) {
        int xorOfAll = 0;
        
        for(int i = 0; i< nums.length; i++) {
            xorOfAll ^= nums[i];
        }
        
        return xorOfAll;
    }
}

// Time Complexity : O(N), where N is the length of input array.
// Space Complexity : O(1)
