import java.util.HashMap;
import java.util.Map;

public class prblm166 {
    public static void main(String[] args) {
        int numerator = 4, denominator = 333;
        System.out.println(new prblm166().fractionToDecimal(numerator, denominator));
    }
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        StringBuilder str = new StringBuilder();
        boolean neg = (numerator > 0) ^ (denominator > 0);
        str.append(neg ? "-" : "");
        long a = Math.abs((long) numerator), b = Math.abs((long) denominator);
        str.append(a / b);
        a %= b;
        if (a == 0) {
            return str.toString();
        }
        str.append(".");
        Map<Long, Integer> d = new HashMap<>();
        while (a != 0) {
            d.put(a, str.length());
            a *= 10;
            str.append(a / b);
            a %= b;
            if (d.containsKey(a)) {
                str.insert(d.get(a), "(");
                str.append(")");
                break;
            }
        }
        return str.toString();
    }
}
