// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int n = height.length;
        int low = 0;
        int high = n - 1;

        while(low<high){
            int currArea = Math.min(height[low], height[high]) * (high-low);
            max = Math.max(max, currArea);
            if(height[low] < height[high])
                low++;
            else
                high--;
        }
        return max;
    }
}