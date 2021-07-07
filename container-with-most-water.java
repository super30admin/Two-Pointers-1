// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        int low=0, high=height.length-1, max=0;
        while(low<high){
            int area=(high-low)*Math.min(height[low], height[high]);
            max=Math.max(max,area);
            if(height[low] < height[high])
                 low++;
             else
                 high--;
         }
         return max; 
    }
}