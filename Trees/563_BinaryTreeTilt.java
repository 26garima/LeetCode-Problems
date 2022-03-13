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
    int sum = 0;
    public int findTilt(TreeNode root) {
        find(root);
        return sum;
    }
    
    public int find(TreeNode root) {
        if(root == null)
            return 0;
        
        int l = find(root.left);
        int r = find(root.right);
        
        sum += Math.abs(l-r);
        return root.val + l + r;
    }
}

/*
  Time Complexity : O(N)
  Space Complexity : O(H), where "N" and "H" are number of nodes and height of input tree respectively.
*/
