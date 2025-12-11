import java.util.*;

public class prblm863 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        TreeNode target = root.left;

        System.out.println(new prblm863().distanceK(root, target, 2));
        
        TreeNode root2 = new TreeNode(0);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(2);
        TreeNode target2 = root2.left;
        System.out.println(new prblm863().distanceK(root2, target2, 2));
    }

    Map<TreeNode, TreeNode> map = new HashMap<>();

    private void makeParent(TreeNode root){
        if (root == null) return;
        
        if (root.left != null) {
            map.put(root.left, root);
        }
        if (root.right != null) {
            map.put(root.right, root);
        }
        makeParent(root.left);
        makeParent(root.right);
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        makeParent(root);
        int level = 0;
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Set<TreeNode> set = new HashSet<>();
        set.add(target);
        queue.add(target);

        while (!queue.isEmpty()) {
            if(level == k) break;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                if (curr.left != null && !set.contains(curr.left)) {
                    queue.add(curr.left);
                    set.add(curr.left);
                }
                if (curr.right != null && !set.contains(curr.right)) {
                    queue.add(curr.right);
                    set.add(curr.right);
                }
                if(map.containsKey(curr) && !set.contains(map.get(curr))){
                    queue.add(map.get(curr));
                    set.add(map.get(curr));
                }
            }
            level += 1;
        }

        while (!queue.isEmpty()) {
            ans.add(queue.poll().val);
        }
        return ans;
    }
}
