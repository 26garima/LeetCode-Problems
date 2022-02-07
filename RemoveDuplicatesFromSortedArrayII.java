#Problem Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2)
            return nums.length;
        
        int prev = nums[0];
        int curr = nums[1];
        int count = 1;
        int i = 1;
        int j = 0;
        
        while(i < nums.length) {
            if(i != 1) {
                prev = curr;
                curr = nums[i];   
            }
            if(prev == curr && count == 1) {
                count = 2;
                nums[j+1] = nums[i];
                j++;
                i++;
            } else if(prev != curr) {
                count = 1;
                nums[j+1] = nums[i];
                j++;
                i++;
            } else if(prev == curr && count == 2) {
                i++;
            }
        }
        return j+1;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
