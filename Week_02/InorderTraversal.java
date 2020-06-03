/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        delite(result,root);
        return result;
    }

    public void delite(List<Integer> result, TreeNode root){
        if(root == null){
            return;
        }
        delite(result, root.left);
        result.add(root.val);
        delite(result, root.right);
    }
}