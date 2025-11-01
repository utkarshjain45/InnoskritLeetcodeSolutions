import java.util.*;

public class prblm295 {
    public static void main(String[] args) {
        MedianFinder obj = new MedianFinder();
        obj.addNum(1);
        obj.addNum(2);
        System.out.println(obj.findMedian());
        obj.addNum(3);
        System.out.println(obj.findMedian());
    }
}


class MedianFinder {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    public MedianFinder() {
        maxHeap = new PriorityQueue<>((a, b) -> b - a);
        minHeap = new PriorityQueue<>((a, b) -> a - b);  
    }
    
    public void addNum(int num) {
        maxHeap.add(num);
        if(maxHeap.size() - minHeap.size() > 1){
            minHeap.add(maxHeap.poll());
        }
        else if(!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()){
            int max = maxHeap.poll();
            int min = minHeap.poll();
            minHeap.add(max);
            maxHeap.add(min);
        }
    }
    
    public double findMedian() {
        double median = 0;
        if(minHeap.size() == maxHeap.size()){
            median = (minHeap.peek() + maxHeap.peek()) / 2;
        }
        else{
            median = maxHeap.peek();
        }
        return median;
    }
}