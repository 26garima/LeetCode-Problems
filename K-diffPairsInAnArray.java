// Problem Link : https://leetcode.com/problems/k-diff-pairs-in-an-array/

class Solution {
    public int findPairs(int[] nums, int k) {
        
        int n = nums.length;
        
        if(n == 1)
            return 0;
        
        Arrays.sort(nums);
        
        int i =0;
        int j =1;
        int count = 0;
        
        while(j < n && i < n) {
            if(i == j || nums[j] - nums[i] < k)
                j++;
            else if(nums[j] - nums[i] > k)
                i++;
            else {
                count++;
                i++;
                while(i < n && nums[i] == nums[i-1])
                    i++;
            }
        }
        
        return count;
    }
}

// Time Complexity : O(N), where N is the length of input array, nums.
// SpaceComplexity : O(1)
