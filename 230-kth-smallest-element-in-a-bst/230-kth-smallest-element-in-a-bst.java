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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stk = new Stack<>();
        TreeNode node = root;
        int count = 0;
        while(true) {
            if(node != null) {
                stk.push(node);
                node = node.left;
            }
            else {
                if(stk.isEmpty()) {
                    break;
                }
                node = stk.pop();
                count++;
                if(count == k) return node.val;
                node = node.right;
            }
        }
        return -1;
    }
}