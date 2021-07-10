// Time Complexity : O(N) N-> No of integers in array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class ContainerWithMostWater {
    public int maxArea(int[] height) {

        int i = 0, j = height.length - 1;
        int maxArea = 0;

        while(i < j) {
            maxArea = Math.max(maxArea, (Math.min(height[i], height[j]) * (j-i)));
            if(height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}