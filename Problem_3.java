// Time Complexity :O(n) n is the length of height
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
// 2 pointer approach one at starting and one pointer at ending of the array decreasing or increasing the minimum out of them
class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length==0 ) return 0;
        int max =0;
        int low=0, high =height.length-1;
        while(low<high){
            max= Math.max(max, Math.min(height[low],height[high])*(high-low));
            if(height[low]<height[high]) low++;
            else high--;
        }
        return max;
    }
}