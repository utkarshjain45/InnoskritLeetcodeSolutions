public class prblm852 {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        System.out.println(new prblm852().peakIndexInMountainArray(arr));
    }

    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low = 1, high = n - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(arr[mid] > arr[mid + 1]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
