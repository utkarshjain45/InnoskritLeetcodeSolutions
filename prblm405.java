public class prblm405 {

    public static void main(String[] args) {
        int num = 26;
        System.out.println(new prblm405().toHex(num));
        
        int num2 = -1;
        System.out.println(new prblm405().toHex(num2));
    }
    
    public String toHex(int num) {
        StringBuilder str = new StringBuilder();
        while(num != 0){
            int rem = num & 15;
            if (rem < 10) {
                str.append(rem);
            }
            else{
                str.append((char) (rem - 10 + 'a'));
            }
            num >>>= 4;
        }
        return str.reverse().toString();
    }
}