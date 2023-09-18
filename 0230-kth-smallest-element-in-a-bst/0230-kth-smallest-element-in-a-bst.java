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
    int ans =0;
    int count=0;
    public int kSmallest(TreeNode root,int k){
        if(root==null)return 0;
        kSmallest(root.left,k);
        count++;
        if(count==k){
            ans=root.val;
            return 0;
        }
        return kSmallest(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        kSmallest(root,k);
        return ans;
    }
}