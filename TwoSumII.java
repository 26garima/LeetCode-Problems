// Problem Link : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0;
        int j = n-1;
        int result[] = new int[2];
        
        while(i < j) {
            if((numbers[i]+numbers[j]) < target) {
                i++;
            } else if((numbers[i] + numbers[j]) == target) {
                result[0] = i+1;
                result[1] = j+1;
                return result;
            } else {
                j--;
            }
        }
        
        return result;
    }
}

/*
Time Compleaxity : O(N), where "N" is the length of input array "numbers".
Space Complexity : O(1)
*/
