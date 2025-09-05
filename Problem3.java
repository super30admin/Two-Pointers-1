// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes  
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
Using Two pointer approach we find the max water that can be stored in container
we calculate the minimum height among two pointers pointing to and mutiply by thier width which gives us the max water
the pointers are moved towards left and right accordingly
*/
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right) {
            maxArea = Math.max(maxArea, (right -left) * Math.min(height[left], height[right]));
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
        
    }
}
