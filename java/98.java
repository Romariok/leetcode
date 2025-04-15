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
   public boolean isValidBST(TreeNode root) {
       return isValid(root, new long[]{(long)Integer.MIN_VALUE-1,(long) Integer.MAX_VALUE+1});
   }
   // 0 - больше числа, 1 - меньше числа
   public boolean isValid(TreeNode root, long[] borders){
       if((long) root.val <= borders[0] || (long) root.val >= borders[1]){
           return false;
       }
       boolean statusLeft = true;
       boolean statusRight = true;
       if (root.left != null){
           long[] leftBorder = borders.clone();
           leftBorder[1] = (long) root.val;
           statusLeft = isValid(root.left, leftBorder);
       }
       if (root.right != null){
           long[] rightBorder = borders.clone();
           rightBorder[0] = (long)root.val;
           statusRight = isValid(root.right, rightBorder);
       }
       return statusRight && statusLeft;
   }
}