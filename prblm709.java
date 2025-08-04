public class prblm709 {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(new prblm709().toLowerCase(s));
        
        String s2 = "here";
        System.out.println(new prblm709().toLowerCase(s2));
        
        String s3 = "LOVELY";
        System.out.println(new prblm709().toLowerCase(s3));
    }

    public String toLowerCase(String s) {
        StringBuilder str = new StringBuilder();
        for (char ch : s.toCharArray()) {
            str.append(Character.toLowerCase(ch));
        }
        return str.toString();
    }

    public String toLowerCase2(String s) {
        return s.toLowerCase();
    }
}
