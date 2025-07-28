public class prblm263 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(new prblm263().isUgly(n));    
        
        int n2 = 14;
        System.out.println(new prblm263().isUgly(n2));    
        
        int n3 = 8;
        System.out.println(new prblm263().isUgly(n3));    
    }

    public boolean isUgly(int n) {
        for(int i = 2; i < n; i++){
            if(n % i == 0 && (i != 2 && i != 3 && i != 5)){
                return false;
            }
        }
        return true;
    }

    public boolean isUgly2(int n) {
        if (n < 1) return false;
        while(n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while(n % 5 == 0) {
            n /= 5;
        }
        return n == 1;
    }
}
