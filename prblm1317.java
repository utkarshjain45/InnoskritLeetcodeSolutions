import java.util.Arrays;

public class prblm1317 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Arrays.toString(new prblm1317().getNoZeroIntegers(n)));       
        
        int n2 = 1010;
        System.out.println(Arrays.toString(new prblm1317().getNoZeroIntegers(n2)));       
    }

    public int[] getNoZeroIntegers(int n) {
        for(int i = 0; i < n; i++){
            int a = i;
            int b = n - i;
            if(!(a + "" + b).contains("0")){
                return new int[] {a, b};
            }
        }
        return new int[] {-1, -1};
    }
}
