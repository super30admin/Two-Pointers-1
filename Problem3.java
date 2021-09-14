// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

//logic is take 2 ptrs one at 0 and one at end. And if height is low then move that ptr 
class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int low=0;
        int high=height.length-1;
        while(low < high){
            max = Math.max(max,Math.min(height[low],height[high])*(high-low));
            if(height[low] < height[high]) low++;
            else high--;
        }
        return max;
    }
}