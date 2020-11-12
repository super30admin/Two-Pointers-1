// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Calculating the distance and changing the pointer based on the lower height to find the max area.
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int low = 0;
        int high = height.length-1;

        while(low<high){
            int currMax = (high - low) * Math.min(height[low], height[high]);
            maxArea = Math.max(currMax, maxArea);

            if(height[low]<height[high]){
                low++;
            }else{
                high--;
            }
        }
        return maxArea;

    }
}
