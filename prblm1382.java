import java.util.ArrayList;
import java.util.List;

public class prblm1382 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        List<Integer> ans = new ArrayList<>();
        TreeNode ansNode = new prblm1382().balanceBST(root);
        new prblm1382().inOrder(ansNode, ans);
        System.out.println(ans);
    }

    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return createTree(list, 0, list.size() - 1);
    }

    private TreeNode createTree(List<Integer> list, int left, int right){
        if (left > right) return null;

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(list.get(mid));

        root.left = createTree(list, left, mid - 1);
        root.right = createTree(list, mid + 1, right);
        return root;
    }

    private void inOrder(TreeNode root, List<Integer> list){
        if(root == null) return;

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
}
