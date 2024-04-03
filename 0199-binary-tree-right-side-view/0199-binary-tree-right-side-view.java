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
        List<Integer> res=new ArrayList<>();
        if(root==null)
            return res;
        Queue<TreeNode> qt=new LinkedList<>();
        qt.offer(root);
        while(!qt.isEmpty()){
            res.add(qt.peek().val);
            int size=qt.size();
            while(size-->0){
                TreeNode curr=qt.poll();
                if(curr.right!=null)
                    qt.offer(curr.right);
                if(curr.left!=null)
                    qt.offer(curr.left);
            }
        }
        return res;
    }
}