// Problem Link : https://leetcode.com/problems/find-all-the-lonely-nodes/

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
    List<Integer> result = new ArrayList<>();
    public List<Integer> getLonelyNodes(TreeNode root) {
        fetchLonelyNodes(root);
        return result;
    }
    
    public void fetchLonelyNodes(TreeNode root) {
        if(root == null)
            return;
        if(root.left == null && root.right != null) {
            result.add(root.right.val);
        } else if(root.left != null && root.right == null) {
            result.add(root.left.val);
        }
        fetchLonelyNodes(root.left);
        fetchLonelyNodes(root.right);
    }
}

/*
  Time Complexity : O(N), as every node is visited exactly once.
  Space Complexity : O(H) for auxillary recursion space, where "N" and "H" are the number of nodes and height of input tree respectively.
*/
