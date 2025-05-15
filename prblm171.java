public class prblm171 {

    public static void main(String[] args) {
        String columnTitle = "A";
        System.out.println(titleToNumber(columnTitle));
    }

    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for(int i = 0; i < columnTitle.length(); i++){
            char curr = columnTitle.charAt(i);
            result = result*26 + (curr-'A'+1);
        }
        return result;
    }
}