// Problem Link : https://leetcode.com/problems/squares-of-a-sorted-array/

class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int i = 0;
        int j = nums.length-1;
        int result[] = new int[j+1];
        int k = j;
        
        while(i <= j) {
            if(nums[i]*nums[i] > nums[j]*nums[j]) {
                result[k--] = nums[i]*nums[i];
                i++;
            } else {
                result[k--] = nums[j]*nums[j];
                j--;
            }
        }
        
        return result;
    }
}

// Time Complexity : O(N), where "N" is the length of input array, "nums".
// Space Complexity : O(N), where "N" is the length of input array, "nums".
