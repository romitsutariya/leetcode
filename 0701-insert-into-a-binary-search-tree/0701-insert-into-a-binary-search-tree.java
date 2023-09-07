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

import java.util.Objects;
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
            root=insert(root, val);
            return root;
    }

    public static TreeNode insert(TreeNode node,int val){
        if(Objects.isNull(node)){
            return  new TreeNode(val);
        }
        if(val<node.val){
             node.left=insert(node.left, val);
        }else if(val>node.val){
            node.right=insert(node.right, val);
        }
        return node;
    }
}