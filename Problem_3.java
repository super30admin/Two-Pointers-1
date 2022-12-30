// Container With Most Water
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach
// consider two pointers: low & high and find area.
// to avoid overflow of water, always consider the min value of height.
// move accordingly by comparing the heights

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int n = height.length;
        int low = 0;
        int high = n-1;

        while(low < high) {
            int currArr = Math.min(height[low], height[high]) * (high - low);
            max = Math.max(max, currArr);
            if(height[low] < height[high])
                low++;
            else
                high--;
        }
        return max;
    }
}