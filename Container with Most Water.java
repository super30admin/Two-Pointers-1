// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach: We have two pointers approach here, because we don't need nested iterations, as the max width from one point to the other can be attained by choosing the extreme right element. 
//So we keep the low pointer at index 0 and high at index n-1. We keep calculating the area and moving the low pointer the value at low index is lesser than value at high index. Otherwise we move the high pointer towards left.

class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int n=height.length;
        int low=0,high=n-1;// twp pointers

        while(low<high)
        {
            int currArea=0;
            if(height[low]<height[high])
            {
                currArea=(high-low)*height[low];
                low++;
            }
            else
            {
                currArea=(high-low)*height[high];
                high--;

            }

            max=Math.max(max,currArea);

        }
        return max;
    }
}

