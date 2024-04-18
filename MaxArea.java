// Time Complexity : O(N), N is the length of input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class MaxArea {
    public int maxArea(int[] height) {
        int n = height.length;
        int low = 0, high = n-1;
        int maxArea = 0, currentArea = 0;
        while(low < high) {
            int h, w = 0;
            w = high - low;
            
            if(height[low] <  height[high]) {
                h = height[low];
                low++;
            } else {
                h = height[high];
                high--;
            }
            
            currentArea = h*w;
            maxArea = Math.max(maxArea, currentArea);
        }
        return maxArea;
    }
    
}