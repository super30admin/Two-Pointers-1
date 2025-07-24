// Time Complexity : O(n)
// Space Complexity : O1
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Approach : use two pointers approach. Maintain low and high at start and end of array. Compute area and check 
/// if it is greater than prev area = 0. Move the pointer which has lower height (in hope that I'll find more height in future)
/// 
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int low = 0, high = height.length-1;
        int n = height.length;
        while(low<high){
            maxArea = Math.max(maxArea, (high-low)*Math.min(height[high], height[low]));
            if(height[low]<height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return maxArea;
    }
}