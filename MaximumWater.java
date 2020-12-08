/** Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). 
Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
* Time complexity O(N) space complexity O(1)
* Code submitted on leetcode
*/
class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0)
            return 0;
        int max = Integer.MIN_VALUE;
        int low = 0, high = height.length -1;
        for (int i = 0; i < height.length-1; i++) {
            max = Math.max(max, Math.min(height[low], height[high]) * (high-low));
            if (height[low] < height[high])
            {
                low++;
            }
            else {
                high --;
            }
        }
        return max;
    }
}
