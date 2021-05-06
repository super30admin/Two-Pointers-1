// Time Complexity :O(n) n is the  no of heights
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
// 2 pointer approach one at starting and one pointer at ending of the array. lowest height is eliminated and pointer is moved. Area is calculated by right-left*minimum of both the heights


class Solution {
    public int maxArea(int[] height) {
        // null case
        if(height == null || height.length== 0 ) return 0;
        int max=0;
        int left =0; int right = height.length-1;
        while(left<right){
            max=Math.max(max, (right-left)*Math.min(height[left],height[right]));
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
       return max; 
    }
}
