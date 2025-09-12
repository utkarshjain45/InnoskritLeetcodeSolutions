public class prblm3227 {
    public static void main(String[] args) {
        String s = "leetcoder";
        System.out.println(new prblm3227().doesAliceWin(s));
    }

    public boolean doesAliceWin(String s) {
        for(char ch : s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                return true;
            }
        }
        return false;
    }
}
