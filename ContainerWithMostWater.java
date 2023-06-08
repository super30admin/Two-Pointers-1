// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to refer to class discussion


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        //use 2 pointer approach
        // find a case to shift the left and right pointer
        int left = 0;
        int right = height.length-1;
        int area = -999999;
        while(left<=right){
            area = Math.max(area,Math.min(height[right],height[left])*Math.abs(right-left));
            if(height[left] <= height[right]){
                left++;
            }else{
                right--;
            }
        }
        return area;
    }
}