// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/* To achieve TC of O(n) and SC of O(1), we mantain 2 pointers hi and lo. We track the area between them and update maxArea if its greater. Since the area is limited by
   smaller height, we move smaller height pointer to try to maximize our area. When lo > hi, we exit and return the maxArea found.
*/

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0)
            return -1;

        int lo = 0, hi = height.length - 1;

        int maxArea = 0;
        while(lo < hi) {
            maxArea = Math.max(maxArea, (hi - lo) * Math.min(height[lo], height[hi]));

            if(height[lo] <= height[hi])
                lo ++;
            else 
                hi --;
        }
        return maxArea;
    }
}