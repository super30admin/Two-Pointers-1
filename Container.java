// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {

        int n = height.length;
        int maxArea = Integer.MIN_VALUE;

        //We will use 2 pointers
        int left = 0;
        int right = n - 1;

        while(left < right) {

            //cal the area of rect = length * breadth
            int current = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, current);

            //since we want the max area, we will skip the smaller length out of left or right
            if(height[left] < height[right])
                left++;
            else 
                right--;
        }
        
        return maxArea;
    }

    //Time complexity = O(n)
    //Space complexity = O(1)
}