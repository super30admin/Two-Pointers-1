//(https://leetcode.com/problems/container-with-most-water/)


// Time Complexity : O(n) where n is the number of elements in the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length-1;
        int area = 0;

        while(low<high){
            area =Math.max(Math.min(height[high],height[low]) * (high - low),area);
            if(height[low] <= height[high])
                low++;
            else
                high--;
        }

        return area;
    }
}