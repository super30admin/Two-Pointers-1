public class ContainerMostWater {
    /**
     * Using two pointers starting with each end, calculate the area (min of height and distance).
     * Move one of the pointers towards the other to maximize on area by moving the lower height pointer
     * towards the other and keep track of maximum area at each new pair.
     *
     * Time: O(n) Space: O(1)
     */
    public int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            result = Math.max(result, Math.min(height[left], height[right]) * (right - left));

            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
