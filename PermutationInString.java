// Pronblem Link : https://leetcode.com/problems/permutation-in-string/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length())
            return false;
        
        int freqS1[] = new int[26];
        
        for(int i=0;i<s1.length();i++) {
            freqS1[s1.charAt(i) - 'a']++;
        }
        
        for(int i=0;i<=s2.length()-s1.length();i++) {
            int freqCurrWindow[] = new int[26];
            System.out.println(i+"  "+(i+s1.length()-1));
            for(int j = i;j<i+s1.length();j++) {
                freqCurrWindow[s2.charAt(j) - 'a']++;
            }
            int flag = 0;
            for(int j = 0;j < 26;j++) {
                if(freqS1[j] != freqCurrWindow[j]) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
                continue;
            else {
                return true;
            }
        }
        
        return false;
    }
}


// Time Complexity : O(N*N), where N is the length of the bigger input string.
// Space Complexity : O(1)
