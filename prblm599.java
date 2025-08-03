import java.util.*;

public class prblm599 {
    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        System.out.println(Arrays.asList(new prblm599().findRestaurant(list1, list2)));
        
        String[] list3 = {"happy","sad","good"};
        String[] list4 = {"sad","happy","good"};
        System.out.println(Arrays.asList(new prblm599().findRestaurant(list3, list4)));
    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list2.length; i++) {
            map.put(list2[i], i);
        }

        List<String> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            if (map.containsKey(list1[i])) {
                int j = map.get(list1[i]);
                if(min > (i + j)){
                    min = i + j;
                    list.clear();
                    list.add(list1[i]);
                }
                else if(min == (i + j)){
                    list.add(list1[i]);
                }
            }
        }
        return list.toArray(new String[0]);
    }
}
