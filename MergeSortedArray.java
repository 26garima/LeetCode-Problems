// Problem Link : https://leetcode.com/problems/merge-sorted-array/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int result[] = new int[m+n];
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < m && j < n) {
            if(nums1[i] < nums2[j]) {
                result[k++] = nums1[i];
                i++;
            } else {
                result[k++] = nums2[j];
                j++;
            }
        }
        
        while(i < m) {
            result[k++] = nums1[i++];
        }  
        
        while(j < n) {
            result[k++] = nums2[j++];    
        }
        
        for(i=0;i<k;i++) {
            nums1[i] = result[i];
        }
    }
}

/*
Time Complexity : O(M+N), where "M", "N" are the lengths of input arrays.
Space Complexity : O(M+N), where "M", "N" are the lengths of input arrays.
*/
