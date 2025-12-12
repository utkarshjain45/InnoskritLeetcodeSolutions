import java.util.*;

public class prblm501 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);

        System.out.println(Arrays.toString(new prblm501().findMode(root)));
    }
    
    int count;
    int max;
    List<Integer> list = new ArrayList<>();
    TreeNode prev;

    public int[] findMode(TreeNode root) {
        prev = root;
        solve(root);

        int[] ans = new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public void solve(TreeNode root){
        if (root == null) return;

        solve(root.left);
        if (prev.val == root.val) {
            count++;
        }
        else{
            count = 1;
        }

        if (count > max) {
            list.clear();
            list.add(root.val);
            max = count;
        }
        else if(count == max){
            list.add(root.val);
        }
        prev = root;
        solve(root.right);
    }
    
    
    // public int[] findMode(TreeNode root) {
    //     Map<Integer, Integer> map = new HashMap<>();
    //     solve(root, map);
    //     int currMax = Integer.MIN_VALUE;
    //     System.out.println(map);
        
    //     List<Integer> list = new ArrayList<>();
    //     for(Map.Entry<Integer, Integer> entry : map.entrySet()){
    //         if (entry.getValue() == currMax) {
    //             list.add(entry.getKey());
    //         }
    //         if(entry.getValue() > currMax){
    //             list.clear();
    //             list.add(entry.getKey());
    //         }
    //         currMax = Math.max(currMax, entry.getValue());
    //     }
    //     int[] ans = new int[list.size()];
    //     for (int i = 0; i < ans.length; i++) {
    //         ans[i] = list.get(i);
    //     }
    //     return ans;
    // }

    // public void solve(TreeNode root, Map<Integer, Integer> map){
    //     if (root == null) return;

    //     solve(root.left, map);
    //     map.put(root.val, map.getOrDefault(root.val, 0) + 1);
    //     solve(root.right, map);
    // }
}
