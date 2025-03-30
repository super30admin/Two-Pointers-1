// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach:
// Consider two pointers at ends of the given array of heights.
// Check for maximum area along the width between the numbers and minimum of the heights at both pointer indices.
// Check and update max area till pointers cross each other.


class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        if(n<2||height==null) return 0;
        int max=0;
        int l=0;
        int r=n-1;
        while(l<r){
            max=Math.max(max,Math.min(height[l],height[r])*(r-l));
            if(height[l]>=height[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return max;
    }
}