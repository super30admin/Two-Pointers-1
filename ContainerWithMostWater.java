// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes


// Your code here along with comments explaining your approach
//## Problem3 (https://leetcode.com/problems/container-with-most-water/)
public class ContainerWithMostWater {
    // previously solved
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right){
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * w;
            max = Math.max(max, area);
            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
        }
        return max;
    }

    public int maxArea2(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int max = 0;
        while(low < high){
            if(height[low] < height[high]){
                max = Math.max(max, height[low] * (high-low));
                low++;
            }else{
                max = Math.max(max, height[high]*(high-low));
                high--;
            }

        }
        return max;
    }
}
