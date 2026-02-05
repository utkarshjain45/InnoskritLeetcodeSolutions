import java.util.*;

public class prblm1305 {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(4);
        
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(0);
        root2.right = new TreeNode(3);

        System.out.println(new prblm1305().getAllElements(root1, root2));
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        dfs(root1, list1);
        List<Integer> list2 = new ArrayList<>();
        dfs(root2, list2);

        List<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while(i < list1.size() && j < list2.size()){
            if(list1.get(i) < list2.get(j)){
                ans.add(list1.get(i));
                i++;
            }
            else if(list1.get(i) > list2.get(j)){
                ans.add(list2.get(j));
                j++;
            }
            else if(list1.get(i) == list2.get(j)){
                ans.add(list1.get(i));
                ans.add(list2.get(j));
                i++;
                j++;
            }
        }
        if(i <= list1.size() - 1){
            while(i <= list1.size() - 1){
                ans.add(list1.get(i));
                i++;
            }
        }
        if(j <= list2.size() - 1){
            while(j <= list2.size() - 1){
                ans.add(list2.get(j));
                j++;
            }
        }
        return ans;
    }

    private void dfs(TreeNode root, List<Integer> list){
        if(root == null) return;

        dfs(root.left, list);
        list.add(root.val);
        dfs(root.right, list);
    }
}
