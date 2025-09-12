public class prblm3516 {
    public static void main(String[] args) {
        int x = 2, y = 7, z = 4;
        System.out.println(new prblm3516().findClosest(x, y, z));
        
        int x2 = 10, y2 = 1, z2 = 12;
        System.out.println(new prblm3516().findClosest(x2, y2, z2));
    }

    public int findClosest(int x, int y, int z) {
        if(Math.abs(y - z) > Math.abs(z - x)){
            return 1;
        }
        else if(Math.abs(y - z) < Math.abs(z - x)){
            return 2;
        }
        else{
            return 0;
        }
    }
}
