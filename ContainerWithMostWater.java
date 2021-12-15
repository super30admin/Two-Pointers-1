// Time Complexity : O(n), n is length of the height array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;

        // Going with two pointer approach
        int low = 0;
        int high = height.length-1;
        int tempArea;
        while(low < high) {
            // when both the elements are equal, move both the elements
            if(height[low] == height[high]) {
                tempArea = (high-low)*height[low];
                high--;
                low++;
            }
            // When element at high is small, the idea is to find the element with large height in order to maximize the
            // area as the width is decreasing, Hence moving pointer towards left
            else if(height[low] > height[high]){
                tempArea = (high-low)*height[high];
                high--;
            }
            // When element at low is small, the idea is to find the element with large height in order to maximize the
            // area as the width is decreasing, Hence moving pointer towards right
            else {
                tempArea = (high-low)*height[low];
                low++;
            }
            max = Math.max(tempArea, max);
        }
        // Max area is in max variable
        return max;
    }
}
