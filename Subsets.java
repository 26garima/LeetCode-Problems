// Problem Link : https://leetcode.com/problems/subsets/

class Solution {
    
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> li = new ArrayList<Integer>();
        subsets(nums,0,li);
        return res;
    }
    
    public void subsets(int[] nums, int index, List<Integer> li) {
        if(index == nums.length) {
            List<Integer> temp = new ArrayList<Integer>();
            int i = 0;
            while(i < li.size()) {
                temp.add(li.get(i));
                i++;
            }
            res.add(temp);
            return;
        }
        li.add(nums[index]);
        subsets(nums, index+1, li);
        if(li.size() != 0)
           li.remove(li.size()-1);
        subsets(nums, index+1, li);
    }
}

// Time Complexity : O(2^N), where N is the length of input array.
// Space Complexity : O(N*(2^N)), where N is the length of input array.
