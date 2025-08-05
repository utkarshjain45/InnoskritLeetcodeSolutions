public class prblm3477 {
    public static void main(String[] args) {
        int[]  fruits = {4,2,5}, baskets = {3,5,4};
        System.out.println(new prblm3477().numOfUnplacedFruits(fruits, baskets));

        int[]  fruits2 = {4,2,5}, baskets2 = {3,5,4};
        System.out.println(new prblm3477().numOfUnplacedFruits(fruits2, baskets2));
    }

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] visited = new boolean[fruits.length];
        int count = 0;
        for(int i = 0; i < fruits.length; i++){
            for(int j = 0; j < baskets.length; j++){
                if(visited[j] == false && baskets[j] >= fruits[i]){
                    count++;
                    visited[j] = true;
                    break;
                }
            }
        }
        return fruits.length - count;
    }
}
