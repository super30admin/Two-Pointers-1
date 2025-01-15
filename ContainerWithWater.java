/**
 * You are given an integer array height of length n.
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 * Notice that you may not slant the container.
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 * Ran on leetcode? Yes
 * Issues faced? No
 *
 * Approach:
 * Two pointers and move the pointer that is smaller closer to another pointer trying to maximize the result
 *
 */
public class ContainerWithWater {
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;

        int max = 0;
        while (left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        ContainerWithWater obj = new ContainerWithWater();
        int[] height = {4,5,7,8,9,10,4,6,7,8,3};
        int maxArea = obj.maxArea(height);
        System.out.println(maxArea);
    }
}
