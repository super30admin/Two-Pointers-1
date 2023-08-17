// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int n = height.length;
        int l=0, r =n -1;

        while(l<r){
            max= Math.max(max, Math.min(height[l], height[r])*(r-l));
            if(height[l]<height[r]) l++;
            else r--;
        }
       return max; 
    }
}