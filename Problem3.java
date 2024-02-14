// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/**
 * We can do this problem in nested approach but to optimize on TC we go ahead
 * with 2-pointer approach. As we want to have maximum area, we move away from
 * smaller height. If both heights are equal, we can move any one of the pointer
 * or both the pointers.
 */

public class Problem3 {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length-1;
        int max = 0;

        while(low<high) {
            int area = (high-low)*Math.min(height[low], height[high]);
            max = Math.max(max, area);

            if(height[low] < height[high]) {
                low++;
            } else if(height[low] > height[high]) {
                high--;
            } else {
                low++;
            }
        }
        return max;
    }
}
