// Time Complexity : O(n). We move either the low or the high pointer every iteration. This cuts down the comparisions from n sqaure to n
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Brute force approach is NxN comparisions
//With 2 pointer approach we move towards a better area by moving the pointer which has lesser value,
//cutting down comparisions from NxN to N

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;

        int low = 0;
        int high = height.length -1;
        int maxArea = 0;
        while(low < high) {
            int currArea = Math.min(height[low],height[high]) * (high - low);
            maxArea = Math.max(maxArea, currArea);

            if(height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }
        return maxArea;
    }
}
