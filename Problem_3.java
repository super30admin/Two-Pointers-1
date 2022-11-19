// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

//11. Container With Most Water
class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length < 2) return -1;
        int low = 0;
        int high = height.length - 1;
        int max = 0;
        while(low < high){
            max = Math.max(max, (high - low)*(Math.min(height[low], height[high])));
            if(height[low] < height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return max;
    }
}