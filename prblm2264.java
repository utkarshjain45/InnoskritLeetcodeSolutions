import java.util.*;

public class prblm2264 {
    public static void main(String[] args) {
        String num = "6777133339";
        System.out.println(new prblm2264().largestGoodInteger(num));
        
        String num2 = "3200014888";
        System.out.println(new prblm2264().largestGoodInteger(num2));
    }

    public String largestGoodInteger(String num) {
        for (int i = 9; i >= 0; i--) {
            String str = String.valueOf(i).repeat(3);
            if (num.contains(str)) {
                return str;
            }
        }
        return "";
    }

    public String largestGoodInteger2(String num) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : num.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        String max = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            if(map.get(num.charAt(i)) >= 3){
                StringBuilder str = new StringBuilder();
                str.append(num.charAt(i));
                str.append(num.charAt(i));
                str.append(num.charAt(i));
                if(num.contains(str) && (max.equals("") || str.charAt(0) > max.charAt(0))){
                    max = str.toString();
                }
            }
        }
        return max;
    }
}
