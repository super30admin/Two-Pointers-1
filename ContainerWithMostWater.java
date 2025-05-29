// Time Complexity : O(n) where n is the height .length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// The approach is to maximize area by taking the minimum length among the two heights and checking at
// the maximum breadth they can have to achieve the maximum area

public class ContainerWithMostWater {
    static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;

        int maxArea = 0;
        while(i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            maxArea = Math.max(maxArea, area);

            if(height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Maximum water is: " + maxArea(height));
    }
}
