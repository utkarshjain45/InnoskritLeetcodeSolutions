public class prblm189 {
public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7};
    rotate(nums, 3);
    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i]);
    }
}

    public static void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        int pos = 0;
        for (int i=nums.length-k; i<nums.length; i++){
            arr[pos] = nums[i];
            pos++;
        }
        for (int i=0; i<k; i++){
            arr[pos] = nums[i];
            pos++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
    }
}
