// Problem Link : https://leetcode.com/problems/add-digits/

class Solution {
    public int addDigits(int num) {
        if(num <= 9)
            return num;
        int sum = 0;
        
        while(num >= 10) {
            sum = 0;
            while(num != 0) {
                int r = num%10;
                sum += r;
                num /= 10; 
            }
            if(sum <= 9)
                break;
            else
                num = sum;
        }
        
        return sum;
    }
}

/*
Time Complexity : O(N*N) where "N" is the numbers of digits in "num".
Space Complexity : O(1)
*/
