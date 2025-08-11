public class prblm860 {
    public static void main(String[] args) {
        int[] bills = {5,5,5,10,20};
        System.out.println(new prblm860().lemonadeChange(bills));

        int[] bills2 = {5,5,10,10,20};
        System.out.println(new prblm860().lemonadeChange(bills2));
        
        int[] bills3 = {5,5,5,20,5,5,5,10,20,5,10,20,5,20,5,10,5,5,5,5};
        System.out.println(new prblm860().lemonadeChange(bills3));
    }

    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            }
            else if(bills[i] == 10){
                if (five <= 0) {
                    return false;
                }
                else{
                    ten++;
                    five--;
                }
            }
            else{
                if (five > 2) {
                    five -= 3;
                }
                else if(ten > 0 && five > 0){
                    ten--;
                    five--;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
