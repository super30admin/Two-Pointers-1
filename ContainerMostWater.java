/* Time Complexity: O(n)
 * Space Complexity: O(1) no extra space needed
 * Leetcode: Yes
 * Any Issues: No
 */
class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int start = 0;
        int end = height.length-1;
        while(start < end)
        {
            int vol = Math.min(height[start], height[end]) * (end-start);
            result = Math.max(vol, result);
            if(height[start] > height[end])
                end--;
            else
                start++;
        }
        return result;
    }
}