import java.util.*;

class Node{
    Node prev;
    int key;
    int val;
    Node next;

    public Node(int key, int val){
        this.key = key;
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

class DLL {
    Node head, tail;
    public DLL(){
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }

    public void addFirst(Node node){
        node.next = head.next;
        node.prev = head;
        head.next = node;
        node.next.prev = node;
    }
    public Node removeLast(){
        Node node = tail.prev;
        tail.prev = tail.prev.prev;
        tail.prev.next = tail;
        return node;
    }
    public void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

class LRUCache {
    int capacity;
    Map<Integer,Node> cache;
    DLL dll;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        dll = new DLL();
        cache = new HashMap<>();
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            dll.removeNode(node);
            dll.addFirst(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        Node node = new Node(key, value);
        if(cache.containsKey(key)){
            Node curr = cache.get(key);
            dll.removeNode(curr);
        }
        else if(capacity == cache.size()){
            Node last = dll.removeLast();
            cache.remove(last.key);
        }
        dll.addFirst(node);
        cache.put(key, node);
    }
}

public class prblm146 {
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
        obj.put(4,4);
        System.out.println("null");
        System.out.println(obj.get(1));
        System.out.println(obj.get(3));
        System.out.println(obj.get(4));
    }
}
