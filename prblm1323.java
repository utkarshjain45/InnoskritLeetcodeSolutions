import java.util.*;

public class prblm1323 {
    public static void main(String[] args) {
        int num = 9669;
        System.out.println(new prblm1323().maximum69Number2(num));
    }

    public int maximum69Number (int num) {
        String number = Integer.toString(num); 
        List<Integer> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        boolean isChanged = false;
        for (char ch : number.toCharArray()) {
            list.add(Character.getNumericValue(ch));
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 6 && !isChanged) {
                str.append(9);
                isChanged = true;
            }
            else{
                str.append(list.get(i));
            }
        }
        return Integer.parseInt(str.toString());
    }

    public int maximum69Number2(int num) {
        return Integer.valueOf(String.valueOf(num).replaceFirst("6", "9"));
    }
}
