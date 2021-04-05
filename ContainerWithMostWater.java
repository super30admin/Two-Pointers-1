// Time Complexity : O(n^2) where n is the length of the height array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for(int i=0;i<height.length;i++) {
            for(int j=i+1;j<height.length;j++) {
                // take the min of both left and right height and multiply it with the width
                max = Math.max(max, Math.min(height[i], height[j]) * (j-i));
            }
        }
        return max;
    }
}
// Time Complexity : O(n) where n is the length of the height array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No
class Solution {
    public int maxArea(int[] height) {
        int start = 0, end = height.length - 1;
        int max = 0;
        while(start <= end) {
            // take the minimum of start and end and multiply it with width
            max = Math.max(max, (Math.min(height[end], height[start]) * (end - start)));
            if(height[end] > height[start]) {
                // we don't need height[start] so keep height[end] and remove height[start]
                start ++;
            }
            else {
                // we don't need height[end] so keep height[start] and remove height[end]
                end--;
            }
        }
        return max;
    }
}
