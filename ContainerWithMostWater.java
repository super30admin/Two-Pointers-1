// ## Problem3 (https://leetcode.com/problems/container-with-most-water/)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int ans = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            if (height[left] <= height[right]) {
                ans = Math.max(ans, height[left] * (right - left));
                left++;
            } else {
                ans = Math.max(ans, height[right] * (right - left));
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        ContainerWithMostWater obj = new ContainerWithMostWater();
        System.out.println("Maximum water in container: " + obj.maxArea(nums));
    }
}
