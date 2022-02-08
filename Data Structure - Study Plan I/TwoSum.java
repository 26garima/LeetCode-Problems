// Problem Link : https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])) {
                result[0] = map.get(target-nums[i]);
                result[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        
        return result;
    }
}

/*
Time Complexity : O(N*N), where "N" is the length of input array, "nums".
Space Complexity : O(N), for map used in the solution.
*/
