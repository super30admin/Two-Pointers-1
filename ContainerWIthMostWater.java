// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Logic for using two pointers and when to increment or decrement them

// Notes : Assign two pointers low and high at the start and end of the array and calculate the area between these pointers, increment the low pointer if value at low is greater than that at high OR decrement the high pointer if value of low is greter than that at high.

public class ContainerWIthMostWater {
    public int maxArea(int[] height) {
        if(height == null || height.length <= 1){
            return -1;
        }

        int low = 0;
        int high = height.length - 1;

        int max = 0;

        while(low <= high){
            max = Math.max(max, Math.min(height[low], height[high]) * (high - low));

            if(height[low] > height[high]){
                high = high - 1;
            } else {
                low = low + 1;
            }
        }

        return max;
    }
}
