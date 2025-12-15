import java.util.*;

class Pair {
    int row;
    int val;
    
    public Pair(int row, int val) {
        this.row = row;
        this.val = val;
    }
}

public class prblm987 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(new prblm987().verticalTraversal(root));

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.right.left = new TreeNode(6);
        root2.right.right = new TreeNode(7);
        root2.left.left.left = new TreeNode(8);
        root2.left.left.right = new TreeNode(9);
        root2.left.right.left = new TreeNode(10);
        root2.left.right.right = new TreeNode(11);
        root2.right.left.left = new TreeNode(12);
        root2.right.left.right = new TreeNode(13);
        root2.right.right.left = new TreeNode(14);
        System.out.println(new prblm987().verticalTraversal(root2));
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, List<Pair>> map = new TreeMap<>();
        solve(root, 0, 0, map);
        List<List<Integer>> ans = new ArrayList<>();
        for (Map.Entry<Integer, List<Pair>> entry : map.entrySet()) {
            List<Pair> currCol = entry.getValue();
            currCol.sort((p1, p2) -> {
                return p1.row == p2.row ? p1.val - p2.val : p1.row - p2.row;
            });
            List<Integer> currAns = new ArrayList<>();
            for (Pair p : currCol) {
                currAns.add(p.val);
            }
            ans.add(currAns);
        }
        return ans;
    }

    public void solve(TreeNode root, int row, int col, TreeMap<Integer, List<Pair>> map){
        if(root == null) return;
        List<Pair> colList = map.getOrDefault(col, new ArrayList<>());
        colList.add(new Pair(row, root.val));
        map.put(col, colList);

        solve(root.left, row + 1, col - 1, map);
        solve(root.right, row + 1, col + 1, map);
    }
}
