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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        rightSideView(root,ans,0);
        return ans;
    }
    public void rightSideView(TreeNode node,List<Integer>ans,int currDepth){
        if(node==null)return;
        if(currDepth==ans.size())ans.add(node.val);
        rightSideView(node.right,ans,currDepth+1);
        rightSideView(node.left,ans,currDepth+1);
    }
}