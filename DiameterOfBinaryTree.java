// Problem Link : https://leetcode.com/problems/diameter-of-binary-tree/

/*
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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        int diaIncludingRoot = height(root.left) + height(root.right);
        int diaOfLeftChild = diameterOfBinaryTree(root.left);
        int diaOfRightChild = diameterOfBinaryTree(root.right);
        return Math.max(Math.max(diaIncludingRoot, diaOfLeftChild), diaOfRightChild);
    }
    
    public int height(TreeNode root) {
        if(root == null)
            return 0;
        int l = height(root.left);
        int r = height(root.right);
        return Math.max(l,r)+1;
    }
}

// Time Complexity : O(N*N), where "N" is the number of nodes in input tree.
// Space Complexity : O(1)
