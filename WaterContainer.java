// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        
        while(left<right){
            if(height[left]>=height[right]){
                area = Math.max((right-left)*height[right],area);
                right--;
            }
            else{
                area = Math.max((right-left)*height[left],area);
                left++;
            }
        }
        return area;
    }
}