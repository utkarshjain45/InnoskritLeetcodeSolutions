public class prblm450 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        new prblm450().inOrder(root);
        System.out.println();
        
        TreeNode ans = new prblm450().deleteNode(root, 3);
        new prblm450().inOrder(ans);
    }

    private TreeNode findLeftMax(TreeNode root){
        if (root.right != null) return findLeftMax(root.right);
        return root;
    }

    private TreeNode deleteNode(TreeNode root, int key){
        if (root == null) return null;
        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        else if(key < root.val){
            root.left = deleteNode(root.left, key);
        }
        else{
            if (root.left == null && root.right == null) return null;
            if (root.left == null || root.right == null){
                return root.left == null ? root.right : root.left;
            }
            TreeNode leftMax = findLeftMax(root.left);
            root.val = leftMax.val;
            root.left = deleteNode(root.left, leftMax.val);
            return root;
        }
        return root;
    }

    private void inOrder(TreeNode root){
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
}
