// Approach:  Maintain two pointers, left and right, initialized to 0 and n−1, respectively. A rectangular container formed by the lines
// at these two pointers has a breadth of right−left, and its height is determined by the shorter of the two lines, as water spills beyond
// that height. Continuously update the global maximum area by comparing it with the current area. Move the left pointer forward or the
// right pointer backward based on which line contributes to the smaller height.
// Time Complexity: O(n) where n - array size
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// https://leetcode.com/problems/container-with-most-water/description/

public class ContainerWithMostWater {

    int findMaxAreaContainer(int[] height) {
        if (height == null || height.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty..");
        }
        int left = 0, right = height.length - 1;
        int maxArea = Integer.MIN_VALUE;
        while (left < right) {
            int currentArea = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, currentArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater cwmw = new ContainerWithMostWater();
        //  Input: height = [1,8,6,2,5,4,8,3,7]
        //  Output: 49
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println("Max area: " + cwmw.findMaxAreaContainer(arr));
    }
}