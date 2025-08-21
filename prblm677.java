import java.util.*;

public class prblm677 {
    public static void main(String[] args) {
        MapSum obj = new MapSum();
        obj.insert("apple",3);
        System.out.println(obj.sum("ap"));
        obj.insert("app",2);
        System.out.println(obj.sum("ap"));
    }
}

class MapSum {

    Map<String, Integer> map;

    public MapSum() {
        map = new HashMap<>();    
    }
    
    public void insert(String key, int val) {
        map.put(key, val);
    }
    
    public int sum(String prefix) {
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getKey().startsWith(prefix)){
                sum += entry.getValue();
            }
        }
        return sum;
    }
}
