/* Time Complexity: O(n)
 * Space Complexity: O(1)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : No
 */

class Solution {
    public int maxArea(int[] height) {
        //null
        if(height == null || height.length == 0) return 0;
        int n = height.length;
        int max = 0;
        int low = 0;
        int high = n-1;
        while(low < high){
            max = Math.max(max, Math.min(height[low], height[high]) * (high - low));
            if(height[low] <= height[high]){
                low++;
            } else {
                high--;
            }
        }
        return max;
    }
}
