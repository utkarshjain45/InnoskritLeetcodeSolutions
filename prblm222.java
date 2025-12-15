public class prblm222 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        System.out.println(new prblm222().countNodes(root));        
    }

    int count;
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        count++;
        if(root.left != null){
            countNodes(root.left);
        }
        if(root.right != null){
            countNodes(root.right);
        }
        return count;
    }
}
