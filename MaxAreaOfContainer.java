// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class MaxAreaOfContainer {

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int low = 0;
        int high = height.length - 1;

        while(low < high) {
            int area = 0;
            if(height[low] < height[high]) {
                area = (high - low) * height[low];
                low++;
            }
            else {
                area = (high - low) * height[high];
                high--;
            }
            maxArea = Math.max(maxArea,area);

        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
