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
    public List<List<Integer>> levelOrder(TreeNode root) {
       Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> res= new ArrayList<>();
        if(root==null)
            return res;
        queue.offer(root);
        while(!queue.isEmpty()){
            List<TreeNode> temp=new ArrayList<>();
            List<Integer> temp1=new ArrayList<>();
            while(!queue.isEmpty())
                temp.add(queue.remove());
            for(TreeNode t:temp){
               temp1.add(t.val);
                if(t.left!=null)
                    queue.offer(t.left);
                if(t.right!=null)
                    queue.offer(t.right);
            }
         res.add(temp1);       
        }
        return res;
    }
}