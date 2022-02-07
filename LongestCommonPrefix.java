// Problem Link : https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int  freq[] = new int[26];
        int n = strs.length;
        StringBuilder sb = new StringBuilder();
        
        if(n == 1)
            return strs[0];
        
        int lenOfSmallestString = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            if(strs[i].length() < lenOfSmallestString)
                lenOfSmallestString = strs[i].length();
        }
        
        for(int i=0;i<lenOfSmallestString;i++) {
            int flag = 0;
            for(int j=0;j<n;j++) {
                if(strs[j].charAt(i) != strs[0].charAt(i)) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                sb.append(strs[0].substring(i,i+1));
            } else {
                break;
            }
        }
        
        return sb.toString();
    }
}

/*
Time Complexity = O(N*length of smallest string), where "N" is the length of input string array, "strs".
Space Complexity : O(1)
*/
