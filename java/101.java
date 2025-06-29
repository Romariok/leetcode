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
   public boolean isSymmetric(TreeNode root) {
       if (root.left == null && root.right == null) return true;
       return isSymmetric(root.left, root.right);
   }

   public boolean isSymmetric(TreeNode left, TreeNode right) {
       boolean isLeftSymmetric = true;
       boolean isRightSymmetric = true;
       if ((left == null || right == null) || (left.val != right.val) ) return false;
       if (left.left == null && left.right == null && right.left == null && right.right == null){
           return left.val == right.val;
       }
       if (left.left != null || right.right != null) isLeftSymmetric = isSymmetric(left.left, right.right);
       if (left.right != null || right.left != null) isRightSymmetric = isSymmetric(left.right, right.left);

       return isLeftSymmetric && isRightSymmetric;

   }

}