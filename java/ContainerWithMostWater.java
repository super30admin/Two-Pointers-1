// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        int max=0;

        int i=0;
        int j=height.length-1;

        while(i<j){

            int min=Math.min(height[i],height[j]);
            max=Math.max(max,min*(j-i));

            if(height[i]<height[j]){
                i++;
            }
            else {
                j--;
            }
        }

        return max;
    }
}