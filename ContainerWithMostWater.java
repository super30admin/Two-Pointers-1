// Time Complexity : O(n)
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {

        int globalMax = Integer.MIN_VALUE;
        int min;
        int left = 0, right = height.length-1;

        while(left<right)
        {
            min = Math.min(height[left], height[right]);
            globalMax = Math.max(globalMax,min*(right-left));
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return globalMax;

    }
}
