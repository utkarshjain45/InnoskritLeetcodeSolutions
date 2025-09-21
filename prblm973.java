import java.util.Arrays;
import java.util.PriorityQueue;

class Point{
    int x, y, distance;
    public Point(int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}

public class prblm973 {
    public static void main(String[] args) {
        int[][] points = {{1,3}, {-2,2}};
        int k = 1;
        System.out.println(Arrays.deepToString(kClosest2(points, k)));

        int[][] points2 = {{3,3}, {5,-1}, {-2,4}};
        int k2 = 2;
        System.out.println(Arrays.deepToString(kClosest2(points2, k2)));
    }

    //Using Direct sorting - O(nlogn)
    public static int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];
        Arrays.sort(points, (a,b) -> (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]));
        for (int i = 0; i < k; i++) {
            ans[i] = points[i];
        }
        return ans;
    }
    
    //Using Priority Queue with int[] - O(klogn)
    public static int[][] kClosest2(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));
        int[][] ans = new int[k][2];
        for (int[] point : points) {
            pq.add(point);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        int i = 0;
        while (!pq.isEmpty()) {
            ans[i] = pq.poll();
            i++;
        }
        return ans;
    }
    
    //Using Priority Queue with a class(Point) - O(klogn)
    public static int[][] kClosest3(int[][] points, int k) {
        PriorityQueue<Point> pq = new PriorityQueue<>((a,b) -> (b.distance - a.distance));
        for (int[] point : points) {
            int x = point[0];
            int y = point[1];
            int distance = x * x + y * y;
            pq.add(new Point(x, y, distance));
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        int[][] ans = new int[k][2];
        int i = 0;
        while (!pq.isEmpty()) {
            Point point = pq.poll();
            ans[i] = new int[]{point.x, point.y};
            i++;
        }
        return ans;
    }
}
