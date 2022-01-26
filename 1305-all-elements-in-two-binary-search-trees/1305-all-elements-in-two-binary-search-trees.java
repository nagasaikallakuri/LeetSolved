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
    List<Integer> res= new ArrayList<>(); 
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        PostorderTraversal(root1);
        PostorderTraversal(root2);
        Collections.sort(res);
        return res;
    }
    public void PostorderTraversal(TreeNode root){
        if(root==null)
            return;
        res.add(root.val);
        PostorderTraversal(root.left);
        PostorderTraversal(root.right);
    }
}