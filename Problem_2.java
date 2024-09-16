/*
Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Runs with Runtime: 2 ms,
                                             Memory Usage : 40 MB.
Any problem you faced while coding this : Implemented as taught in class
*/

import java.util.*;

class ContainerMaxArea {
    public static int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int low = 0;
        int high = height.length-1;
        while(low < high)
        {
            int currentArea = 0;
            if(height[low] < height[high])
            {
                currentArea = height[low]*(high-low);
                low++;
            }
            else
            {
                currentArea = height[high]*(high-low);
                high--;
            }
            max = Math.max(max, currentArea);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.print(maxArea(nums));
    }
}
