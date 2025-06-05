/**
 * Calculates the maximum area of water that can be contained between two lines,
 * based on the given array of line heights.
 *
 * Problem:
 * - Each element in the array represents the height of a vertical line on the
 * x-axis.
 * - Find two lines that, together with the x-axis, form a container holding the
 * most water.
 *
 * Approach:
 * - Use a two-pointer technique starting from both ends of the array.
 * - At each step, calculate the area formed by the two pointers.
 * - Move the pointer with the shorter height inward, hoping to find a taller
 * line.
 * - Update the maxArea if a larger area is found.
 *
 * Time Complexity: O(n)
 * - Each element is visited at most once by either pointer.
 *
 * Space Complexity: O(1)
 * - Only constant extra space is used.
 *
 */

public class con_with_water {

    public static int maxArea(int[] heights) {
        int maxArea = 0;
        int low = 0;
        int high = heights.length - 1;
        while (low <= high) {
            if (heights[low] < heights[high]) {
                int area = heights[low] * (high - low);
                maxArea = Math.max(maxArea, area);
                low++;
            } else {
                int area = heights[high] * (high - low);
                maxArea = Math.max(maxArea, area);
                high--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights_1 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int[] heights_2 = { 1, 1 };

        System.out.println(maxArea(heights_1));
        System.out.println(maxArea(heights_2));
    }

}
