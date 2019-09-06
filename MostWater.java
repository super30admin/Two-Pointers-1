/**
 * Given n non-negative integers a1, a2, ..., an , where each represents a point
 * at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
 * of line i is at (i, ai) and (i, 0). Find two lines, which together with
 * x-axis forms a container, such that the container contains the most water.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * Leetcode Result:
 * Runtime: 2 ms, faster than 94.41% of Java online submissions for Container With Most Water.
 * Memory Usage: 39.2 MB, less than 98.72% of Java online submissions for Container With Most Water.
 */
public class MostWater {
    /**
     * Use 2 pointer low and high, start off by tracking the max-so-far water area.
     * Update the max-so-far accordingly.
     * Now if height of container at low is less than that at high, increment low, otherwise decrement high.
     */
    public int maxArea(int[] nums) {
        int low = 0, high = nums.length - 1;
        int maxWater = Integer.MIN_VALUE;
        while(low < high) {
            // compute current area
            int currentWater = (high - low) * Math.min(nums[high], nums[low]);
            // update max so far
            maxWater = Math.max(currentWater, maxWater);
            if(nums[low] < nums[high]) {
                low++;
            } else {
                high--;
            }
        }
        return maxWater;
    }
}