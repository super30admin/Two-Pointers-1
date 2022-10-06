// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// TC: O(N)
// SC: O(1)

// - Maintain the left(at start) and right(at end) pointer
// - From value at left and right pointer whichever is the minimum, we can say that
// would be max heigth till which we can contain water
// - Calculate the are using the width(diff between R and L) and height. Record the are if it's maximum
// - Now we need to move the pointer. Since we are trying to reduce the width we should try to maximize the height.
// - So we will move the pointer which has less height than other
// - Keep moving until pointer crosses each other

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;

        int n = height.length;
        int left = 0;
        int right = n - 1;
        int maxWater = 0;

        while(left <= right) {
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;
            maxWater = Math.max(maxWater, minHeight*width);

            if(height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }

        return maxWater;
    }
}