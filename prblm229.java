import java.util.*;

public class prblm229 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        List<Integer> ans = majorityElement2(nums);
        System.out.println(ans.toString());
        
        int[] nums2 = {1,2};
        List<Integer> ans2 = majorityElement2(nums2);
        System.out.println(ans2.toString());
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > (nums.length / 3)) {
                if (list.contains(num)) {
                    continue;
                }
                else{
                    list.add(num);
                }
            }
        }
        return list;
    }

    public static List<Integer> majorityElement2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int count1 = 0, max1 = 0;
        int count2 = 0, max2 = 0;

        for (int x : nums) {
            if (count1 == 0 && x != max2) {
                max1 = x;
                count1 = 1;
            } 
            else if (count2 == 0 && x != max1) {
                max2 = x;
                count2 = 1;
            } 
            else if(x == max1){count1++;}
            else if(x == max2){count2++;}
            else {
                count1 -= 1;
                count2 -= 1;
            }
        }
        int c1 = 0;
        int c2 = 0;
        for (int x : nums) {
            if(x == max1) c1++;
            else if(x == max2) c2++;
        }
        if(c1 > (nums.length / 3)) list.add(max1);
        if(c2 > (nums.length / 3)) list.add(max2);
        return list;
    }
}
