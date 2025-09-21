import java.util.*;

class Pair{
    char ch;
    int freq;
    public Pair(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }
}

public class prblm451 {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(new prblm451().frequencySort(s));
        
        String s2 = "cccaaa";
        System.out.println(new prblm451().frequencySort2(s2));
    }

    // using Map.Entry<Character, Integer> entry
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            maxHeap.add(entry);
        }

        StringBuilder str = new StringBuilder();
        while(!maxHeap.isEmpty()){
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            char character = entry.getKey();
            int frequency = entry.getValue();
            for(int i = 0; i < frequency; i++){
                str.append(character);
            }
        }
        return str.toString();
    }

    //By implementing our custom class
    public String frequencySort2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> b.freq - a.freq);
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            maxHeap.add(new Pair(entry.getKey(), entry.getValue()));
        }

        StringBuilder str = new StringBuilder();
        while(!maxHeap.isEmpty()){
            Pair pair = maxHeap.poll();
            char character = pair.ch;
            int frequency = pair.freq;
            for(int i = 0; i < frequency; i++){
                str.append(character);
            }
        }
        return str.toString();
    }
}