import java.util.*;

public class prblm509 {
    public static void main(String[] args) {
       int n = 3;
       System.out.println(new prblm509().fib2(n));

       int n2 = 4;
       System.out.println(new prblm509().fib2(n2));
    }

    public int fib(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    
    public int fib2(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i <= n; i++) {
            list.add(list.get(i - 1) + list.get(i - 2));
        }

        return list.get(list.size() - 1);
    }
}
