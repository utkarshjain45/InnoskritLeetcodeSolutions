import java.util.Arrays;

public class prblm1304 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(new prblm1304().sumZero(n)));
        System.out.println(new prblm1304().isSumZero(new prblm1304().sumZero(n)));
        
        int n2 = 3;
        System.out.println(Arrays.toString(new prblm1304().sumZero2(n2)));
        System.out.println(new prblm1304().isSumZero(new prblm1304().sumZero2(n2)));
    }

    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int j = 0;
        for(int i = 1; i <= n / 2; i++){
            ans[j] = i;
            j++;
            ans[j] = -i;
            j++;
        }
        return ans;
    }

    public int[] sumZero2(int n) {
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = i; 
        }
        ans[0] = -(n * (n - 1) / 2);
        return ans;
    }

    public boolean isSumZero(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum == 0;
    }
}
