// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while(left < right){
            int area = (right-left) * Math.min(height[left], height[right]);
            max = Math.max(max, area);
            if(height[left] < height[right]){
                left++;
            } else right--;
        }

        return max;
    }
}
