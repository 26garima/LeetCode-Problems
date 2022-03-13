// Problem Link : https://leetcode.com/problems/univalued-binary-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int x = -1;
    public boolean isUnivalTree(TreeNode root) {
        x = root.val;
        return check(root);
    }
    
    public boolean check(TreeNode root) {
        if(root == null)
            return true;
        
        return (x == root.val) && check(root.left) && check(root.right);
    }
}

/*
  Time Complexity : O(N), as every node is visited exactly once.
  Space Complexity : O(H), for auxillary recursion space where "N" and "H" are number of nodes and height of tree respectively.
*/
