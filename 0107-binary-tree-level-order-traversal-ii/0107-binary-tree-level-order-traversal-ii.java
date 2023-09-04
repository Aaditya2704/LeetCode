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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode>queue =new LinkedList<TreeNode>();
        List<List<Integer>>dummy=new LinkedList<List<Integer>>();
        List<List<Integer>>ans=new LinkedList<List<Integer>>();
        if(root==null)return ans;
        queue.offer(root);
        while(!queue.isEmpty()){
            int level=queue.size();
            List<Integer>subList=new ArrayList<>();
            for(int i=0;i<level;i++){
                if(queue.peek().left!=null)queue.offer(queue.peek().left);
                if(queue.peek().right!=null)queue.offer(queue.peek().right);   
                subList.add(queue.poll().val);
            }
            dummy.add(subList);
        }
        
        for(int i=dummy.size()-1;i>=0;i--)ans.add(dummy.get(i));
        return ans;
    }
}