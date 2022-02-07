// Problem Link : https://leetcode.com/problems/search-a-2d-matrix/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int i=0;i<m;i++) {
            if(target == matrix[i][n-1])
                return true;
            if(target < matrix[i][n-1]) {
                for(int j=0;j<n;j++) {
                    if(target == matrix[i][j])
                        return true;
                }
                return false;
            } else {
                continue;
            }
        }
        return false;
    }
}

/*
Time Complexity : O(m+n)
  where m,n are the number of rows and columns respectively.
Space Complexity : O(1)
*/
