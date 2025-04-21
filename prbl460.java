import java.util.*;

class Node{
    Node prev;
    int key;
    int val;
    int frequency;
    Node next;

    public Node(int key, int val, int frequency){
        this.key = key;
        this.val = val;
        this.frequency = frequency;
        this.next = null;
        this.prev = null;
    }
}

class DLL {
    Node head, tail;
    int size;

    public DLL(){
        head = new Node(-1,-1,-1);
        tail = new Node(-1,-1,-1);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    public void addFirst(Node node){
        node.next = head.next;
        node.prev = head;
        head.next = node;
        node.next.prev = node;
        size++;
    }
    public Node removeLast(){
        if(size == 0){
            return null;
        }
        Node node = tail.prev;
        tail.prev = tail.prev.prev;
        tail.prev.next = tail;
        size--;
        return node;
    }
    public void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
    }
}

class LFUCache {

    int minFrequency;
    int capacity;
    Map<Integer,Node> cache;
    Map<Integer,DLL> LRUfrequency;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFrequency = 1;
        cache = new HashMap<>();
        LRUfrequency = new HashMap<>();
    }

    public void promote(Node node){
        DLL currdll = LRUfrequency.get(node.frequency);
        currdll.removeNode(node);
        
        if(currdll.size == 0 && minFrequency == node.frequency){
            minFrequency++;    
        }

        node.frequency++;
        if(!LRUfrequency.containsKey(node.frequency)){
            LRUfrequency.put(node.frequency, new DLL());
        }
        currdll = LRUfrequency.get(node.frequency);
        currdll.addFirst(node);
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            promote(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            node.val = value;
            promote(node);
            return;
        }
        else if (cache.size() == capacity) {
            DLL dll = LRUfrequency.get(minFrequency);
            Node last = dll.removeLast();
            cache.remove(last.key);
        }
        Node node = new Node(key, value, 1);
        cache.put(key, node);
        minFrequency = 1;
        if (!LRUfrequency.containsKey(minFrequency)) {
            LRUfrequency.put(minFrequency, new DLL());            
        }
        DLL dll = LRUfrequency.get(minFrequency);
        dll.addFirst(node);
    }
}

public class prbl460 {
    public static void main(String[] args) {
        LRUCache obj = new LRUCache(2);
        obj.put(1,1);
        System.out.println("null");
        obj.put(2,2);
        System.out.println("null");
        System.out.println(obj.get(1));
        obj.put(3,3);
        System.out.println("null");
        System.out.println(obj.get(2));
        System.out.println(obj.get(3));
        obj.put(4,4);
        System.out.println("null");
        System.out.println(obj.get(1));
        System.out.println(obj.get(3));
        System.out.println(obj.get(4));
    }
}
