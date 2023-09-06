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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>result=new ArrayList<>();
        if(root==null)return result;
        Queue<TreeNode>queue =new LinkedList<TreeNode>();
        queue.offer(root);
        boolean flag=true;
        while(!queue.isEmpty()){
            int levelNum=queue.size();
            List<Integer>subList=new ArrayList<>();
            for(int i=0;i<levelNum;i++){
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                if (flag == true) subList.add(queue.poll().val);
                else subList.add(0, queue.poll().val);
            }
            flag=!flag;
            result.add(subList);
        }
        return result;
    }
}