// Time Complexity : O(n) traversing the heights array where n is the number of heights 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
/* Your code here along with comments explaining your approach: We use the two pointer approach. We move low from left to right and high from right to left.
We calculate the area of first and the last element first and store it in max variable. whichever is the minimum, the heigh[low] or height[high], we leave
away the minimum to move on to the next height as we want to maximize our area. Similarly, we update our max variable and return it at the end.
*/
public class Solution {
    public int maxArea(int[] height) {
        int low = 0, high = height.length-1, max = -1;
        if(height == null || height.length==0){return 0;}
        while(low < high){
            int area = (high - low) * (Math.min(height[high], height[low]));            // Area Calculation
            max = Math.max(area, max);                                                  // Update the Max variable
            if(height[low] < height[high]){                                                // Leave away the minimum height as we wanna maximise area
                low++;
            } else {
                high--;
            }
        }
        return max;
    }
        
}