// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

public class Solution {
    public int MaxArea(int[] height) {
        int n = height.Length;
        int maxArea = 0;
        int low = 0;
        int high = n - 1;
        while(low < high) {
            int area = Math.Min(height[low], height[high]) * (high-low);
            maxArea = area > maxArea ? area : maxArea;
            if(height[low] < height[high]) { //fix to higher value's index and update the other index
                low++;
            }
            else if(height[low] == height[high]) { // update both indices if the heights are equal
                low ++;
                high--;
            }
            else {
                high--;
            }
        }
        return maxArea;
    }
}