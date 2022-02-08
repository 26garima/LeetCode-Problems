// Problem Link : https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
        
        if(n == 0 || n == 1) {
            return n;
        }
        
        int j = 0, i = 0;
        Map<Character, Integer> map = new HashMap<>();
        int ans = Integer.MIN_VALUE;
        
        while(j < n) {
            if(!map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), 1);
                ans = Math.max(ans, j-i+1);
                j++;
            } else { 
                if(map.get(s.charAt(j)) != 0) {
                    map.put(s.charAt(i), map.get(s.charAt(i))-1);
                    i++;   
                } else {
                    map.put(s.charAt(j), map.get(s.charAt(j))+1);
                    ans = Math.max(ans, j-i+1);
                    j++;
                }
            }    
        }
        
        return ans;
        
    }
}


/*
Time Complexity : O(N), where "N" is the length of input string, "s".
Space Compleity : O(N) for the map used in solution.
*/
