public class prblm2125 {
    public static void main(String[] args) {
        String[] bank = {"011001","000000","010100","001000"};
        System.out.println(new prblm2125().numberOfBeams(bank));
    }

    public int numberOfBeams(String[] bank) {
        int ans = 0, pre = 0;
        for (String row : bank) {
            int curr = 0;
            for (int i = 0; i < row.length(); i++) {
                curr += row.charAt(i) - '0';
            }

            if (curr > 0) {
                ans += pre * curr;
                pre = curr;
            }
        }
        return ans;
    }
}
