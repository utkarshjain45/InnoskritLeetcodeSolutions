import java.util.PriorityQueue;

public class prblm897 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(3);
        root.right=new TreeNode(6);
        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(4);
        root.right.right=new TreeNode(8);
        root.left.left.left=new TreeNode(1);
        root.right.right.left=new TreeNode(7);
        root.right.right.right=new TreeNode(9);

        new prblm897().preOrder(root);
        System.out.println();
        
        TreeNode ans = new prblm897().increasingBST2(root);
        new prblm897().preOrder(ans);
        
    }

    private TreeNode increasingBST(TreeNode root) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        solve(root, pq);
        System.out.println(pq);

        TreeNode temp = new TreeNode(pq.poll());
        makeOrderTree(temp, pq);
        return temp;
    }
    
    private void makeOrderTree(TreeNode temp, PriorityQueue<Integer> pq){
        if (!pq.isEmpty()) {
            temp.left = null;
            temp.right = new TreeNode(pq.poll());
            makeOrderTree(temp.right, pq);
        }
    }
    
    private void solve(TreeNode root, PriorityQueue<Integer> pq){
        if (root == null) return;
        
        pq.add(root.val);
        solve(root.left, pq);
        solve(root.right, pq);
    }
    
    private void preOrder(TreeNode root){
        if (root == null) return;
        
        System.out.print(root .val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    TreeNode head = new TreeNode(0);
    TreeNode curr = head;
    private TreeNode increasingBST2(TreeNode root) {
        solve2(root);
        return head.right;
    }

    private void solve2(TreeNode root){
        if (root == null) return;

        solve2(root.left);
        root.left = null;
        curr.right = root;
        curr = root;

        solve2(root.right);
    }
}
