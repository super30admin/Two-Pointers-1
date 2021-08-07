/* Time Complexity :  O(n)
   Space Complexity :   O(1)
   Did this code successfully run on Leetcode : Yes
   Any problem you faced while coding this : No
   Method:Using two pointers, finding the minimum height and calculating the area.
*/
class Solution {
    public int maxArea(int[] height) {
        int low=0,high=height.length-1;
        int max = Integer.MIN_VALUE;
        while(low<high)
        {
            max = Math.max(max, Math.min(height[low],height[high]) * (high - low));
            if(height[low] < height[high])
            {
                low++;
            }
            else
            {
                high--;
            }
        }
        return max;
        
    }
}