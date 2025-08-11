public class prblm11 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(new prblm11().maxArea(height));
        
        int[] height2 = {1,1};
        System.out.println(new prblm11().maxArea(height2));

    }

    //BruteForce Approach
    public int maxArea(int[] height) {
        int area = 0;
        int maxArea = 0;
        for (int i = 0; i < height.length - 1; i++) {
            area = 0;
            for (int j = 0; j < height.length; j++) {
                int minHeight = Math.min(height[i], height[j]);
                area = minHeight * (j - i);
                maxArea = Math.max(area, maxArea);
            }
        }
        return maxArea;
    }
    public int maxArea2(int[] height) {
        int l = 0, r = height.length - 1;
        int maxArea = 0;
        while (l < r) {
            int minHeight = Math.min(height[l], height[r]);
            int width = r - l;
            int area = minHeight * width;
            maxArea = Math.max(maxArea, area);

            if (height[l] < height[r]) {
                l++;
            }
            else{
                r--;
            }
        }
        return maxArea;
    }
}
