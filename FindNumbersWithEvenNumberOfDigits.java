// Problem Link : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int result = 0;
        
        for(int i=0;i<n;i++) {
            int currNum = nums[i];
            int count = 0;
            while(currNum != 0) {
                int currDig = currNum%10;
                count++;
                currNum /= 10;
            }
            
            if(count%2 == 0)
                result++;
        }
        
        return result;
    }
}

/*
Time Complexity : O(N*10^5), where N is the length of input array, "nums".
Space Complexity : O(1)
*/
