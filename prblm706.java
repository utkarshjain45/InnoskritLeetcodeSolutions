import java.util.*;

public class prblm706 {
    public static void main(String[] args) {
        MyHashMapUsingArray map1 = new MyHashMapUsingArray();
        map1.put(1, 1);
        map1.put(1, 1);
        System.out.println(map1.get(1));
        System.out.println(map1.get(3));
        map1.put(2,1);
        System.out.println(map1.get(2));
        map1.remove(2);
        System.out.println(map1.get(2));

        MyHashMapUsingArrayList map2 = new MyHashMapUsingArrayList();
        map2.put(1, 1);
        map2.put(1, 1);
        System.out.println(map2.get(1));
        System.out.println(map2.get(3));
        map2.put(2,1);
        System.out.println(map2.get(2));
        map2.remove(2);
        System.out.println(map2.get(2));
    }
}

class MyHashMapUsingArrayList {
    List<Integer> arr;
    public MyHashMapUsingArrayList() {
        arr = new ArrayList<>(Collections.nCopies(1000001, -1));
    }
    
    public void put(int key, int value) {
        arr.set(key, value);
    }
    
    public int get(int key) {
        return arr.get(key);
    }
    
    public void remove(int key) {
        arr.set(key, -1);
    }
}

class MyHashMapUsingArray {
    int[] arr = new int[1000001];
    public MyHashMapUsingArray() {
        Arrays.fill(arr, -1);
    }
    
    public void put(int key, int value) {
        arr[key] = value; 
    }
    
    public int get(int key) {
        return arr[key];
    }
    
    public void remove(int key) {
        arr[key] = -1;
    }
}
