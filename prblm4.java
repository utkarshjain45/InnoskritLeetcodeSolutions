public class prblm4 {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(new prblm4().findMedianSortedArrays2(nums1, nums2));
    }

    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if(m > n) return findMedianSortedArrays(nums2, nums1);

        int low = 0, high = m;
        int partition = (m + n + 1) / 2;
        while(low <= high){
            int mid1 = low + (high - low) / 2;
            int mid2 = partition - mid1;

            int l1 = ((mid1 - 1) >= 0) ? nums1[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = ((mid2 - 1) >= 0) ? nums2[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = mid1 < m ? nums1[mid1] : Integer.MAX_VALUE;
            int r2 = mid2 < n ? nums2[mid2] : Integer.MAX_VALUE;

            if(l1 <= r2 && l2 <= r1){
                if((m + n) % 2 == 1){
                    return Math.max(l1, l2);
                }
                return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
            }
            if(l2 > r1) low = mid1 + 1;
            else high = mid1 - 1;
        }
        return -1;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m + n];
        int i = 0, j = 0, k = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                arr[k++] = nums1[i++];
            }
            else if(nums1[i] > nums2[j]){
                arr[k++] = nums2[j++];
            }
            else{
                arr[k++] = nums1[i++];
                arr[k++] = nums2[j++];
            }
        }

        while(i < m){
            arr[k++] = nums1[i++];
        }
        while(j < n){
            arr[k++] = nums2[j++];
        }

        if((m + n) % 2 == 1) return arr[(m + n) / 2];
        int second = (m + n) / 2;
        int first = second - 1;
        return (arr[first] + arr[second])/2.0;
    }
}