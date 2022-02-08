// Problem Link : https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters/

class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        
        int n = s.length();
        
        if(n == 1 || n == 2)
            return n;
        
        int ans = Integer.MIN_VALUE;
        int freq[] = new int[256];
        int currCountOfCharacters = 0;
        int i = 0, j = 0;
        
        while(j < n) {
           if(freq[(int)(s.charAt(j))] == 0) {
               
               if(currCountOfCharacters < 2) {
                   
                   freq[(int)(s.charAt(j))]++;
                   currCountOfCharacters++;
                   ans = Math.max(ans, j-i+1);
                   j++;
                   
               } else {
                   
                   freq[(int)(s.charAt(i))]--;
                   if(freq[(int)(s.charAt(i))] == 0)
                       currCountOfCharacters--;
                   i++;
                   continue;
                   
               }
           } else {
               
               freq[(int)(s.charAt(j))]++;
               ans = Math.max(ans, j-i+1);
               j++;
               
           }
        }
        
        return ans;
    }
}

// Time Complexity : O(N), where N is the length of inout string, "s".
// Space Complexity : O(1)
