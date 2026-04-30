// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int low = 0; int high = n-1;
        int area = 0;

        while(low < high) {
            int h = 0;
            int w = high - low;

            if (height[low] < height[high]) {
                h = height[low];
                low++;
            } else {
                h = height[high];
                high--;
            }

            area = Math.max(area, h*w);
        }

        return area;
    }
}