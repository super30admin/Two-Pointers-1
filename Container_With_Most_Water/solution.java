// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/**
 * We keep one pointer at index 0 and other at last location of array.
 * Now for area we take product of min between element at index low and element at index high. We multiply this with difference between high and low.
 * Now there is only one way in which area can be increased. We increase height to be consider for area.
 * We change high pointer then also our height will be element at low or lower between element at high and low.
 * So area will not increase but decrease as we decresed width by decrementing high pointer
 * So we change the pointer which is pointing at lower value as this way only height can be increased and so area (i.e. low++ and high--)
 * We keep doing this till low < high. And each iteration we calculate area with updated width and new hight and keep track of max area we have got so far.
 * This way at the end we get max area that can be formed
*/
class Solution {
    public int maxArea(int[] height) {
        
        int ans = 0;
        int low = 0;
        int high = height.length - 1;
        
        while(low  high){
            ans = Math.max(ans, Math.min(height[low], height[high])  (high-low));
            if(height[low]  height[high])low++;
            else high--;
        }
        
        return ans;
    }
}