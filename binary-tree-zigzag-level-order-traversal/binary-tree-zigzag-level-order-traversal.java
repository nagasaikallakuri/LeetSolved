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
        List<List<Integer>> res= new ArrayList<>();
        if(root==null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag=true;
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> temp=new ArrayList<>();
            while(size-->0){
                TreeNode curr=queue.remove();
                temp.add(curr.val);
                if(curr.left!=null)
                    queue.offer(curr.left);
                if(curr.right!=null)
                    queue.offer(curr.right);
            }
            if(!flag)
                Collections.reverse(temp);
            flag=!flag;
         res.add(temp);
        }
        return res;
    }
}