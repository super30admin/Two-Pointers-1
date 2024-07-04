// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class ContainerWithMostWater {
    public int maxArea(int[] height) {

        // 2 pointers

        int n = height.length;
        int maxCapacity = Integer.MIN_VALUE;
        int left = 0;
        int right = n - 1;

        while(left < right) {
            // Area = height * width
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxCapacity = Math.max(maxCapacity, currentArea);
            if(height[left] <= height[right])
                left++;
            else
                right--;
        }

        return maxCapacity;
    }
}