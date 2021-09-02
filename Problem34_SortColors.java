// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        int[] color = new int[3];
        Arrays.fill(color, 0);
        for(int num: nums) {
            color[num]++;
        }
        Arrays.fill(nums, 0, color[0], 0);
        Arrays.fill(nums, color[0], color[0] + color[1], 1);
        Arrays.fill(nums, color[0] + color[1], color[0] + color[1] + color[2], 2);
    }
}