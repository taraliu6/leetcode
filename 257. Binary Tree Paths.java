

//solution 1

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        helper(root,res,"");
        return res;
    }
    public void helper(TreeNode root, List<String> res, String path) {
        if (root == null) return;
        if (root.left == null &&root.right == null) {
            res.add(path + root.val);
            return;
        }
        helper(root.left,res,path + root.val + "->");
        helper(root.right, res,path + root.val + "->");
    }
}

