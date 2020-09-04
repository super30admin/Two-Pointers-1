// Time Complexity : O(N) N = length of the height array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
//While keeping track of both the left and right pointers calculate area from the given heights.
//After each computation we can check for the max area.

class ContainerWater {
    public int maxArea(int[] height) {

        if (height == null || height.length <= 1)
            return 0;

        int area = 0;
        int max = Integer.MIN_VALUE;
        int left = 0, right = height.length - 1;
        while (left < right) {
            if (height[left] > height[right]) {
                area = (right - left) * height[right];
                right--;

            } else {
                area = (right - left) * height[left];
                left++;
            }
            max = Math.max(max, area);

        }
        return max;
    }
}