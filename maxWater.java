// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        int low = 0; int high = height.length-1;
        int maxArea = 0;
        while(low < high){
            int currArea = (high - low) * Math.min(height[high], height[low]);
            maxArea = Math.max(maxArea, currArea);
            if(height[high] >= height[low]){
                low++;
            }
            else if(height[high] < height[low]){
                high--;
            }
        }
       return maxArea; 
    }
}