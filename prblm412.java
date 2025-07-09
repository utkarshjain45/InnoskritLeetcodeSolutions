import java.util.*;

public class prblm412 {
    public static void main(String[] args) {
        int n = 3;
        List<String> ans = fizzBuzz(n);
        System.out.println(ans);

        int n2 = 5;
        List<String> ans2 = fizzBuzz(n2);
        System.out.println(ans2);
        
        int n3 = 15;
        List<String> ans3 = fizzBuzz(n3);
        System.out.println(ans3);
    }

    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                ans.add("Fizz");
            }
            else if (i % 5 == 0) {
                ans.add("Buzz");
            }
            else{
                ans.add(Integer.toString(i));
            }
        }
        return ans;
    }
}
