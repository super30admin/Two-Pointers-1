// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english  : Start with two pointers and move inward from the pointer where height is less because that is the limiting height.
// Used two pointers to save the nested iterations.
// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;

        int low = 0 ; int high = n-1;

        while(low < high){
            int currArea = (high - low) * Math.min(height[low],height[high]);
            max = Math.max(max, currArea);

            // move inward from smaller height as that is the limiting factor.
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