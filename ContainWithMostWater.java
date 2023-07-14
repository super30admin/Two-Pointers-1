// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
//Here I have used two pointer approach low and high and taking min height and proceed
public class ContainWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int low = 0;
        int high = height.length-1;

        while(low<high){
            if(height[low]<=height[high]){
                int currArray = (high-low) * height[low];
                max = Math.max(max, currArray );
                low++;
            }
            else {
                int currArray = (high-low) * height[high];
                max=Math.max(max, currArray);
                high--;
            }
        }
        return max;
    }
}
