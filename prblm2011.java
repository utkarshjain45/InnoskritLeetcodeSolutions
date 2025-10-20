public class prblm2011 {

    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(new prblm2011().finalValueAfterOperations(operations));
    }

    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for(String str : operations){
            if(str.contains("+")){
                ans++;
            }
            else{
                ans--;
            }
        }
        return ans;
    }
    
    public int finalValueAfterOperations2(String[] operations) {
        int ans = 0;
        for(String str : operations){
            ans += (str.contains("+") ? 1 : -1);
        }
        return ans;
    }
}