// TC: O(N) - N is the length of height array
// SC: O(1) - no extra space is required
// Did it run successfully on Leetcode? : Yes
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length-1;
        while ( i < j)
        {            
            maxArea = Math.max(maxArea,Math.min(height[i], height[j])* (j-i));
            if ( height[i] <= height[j])
            {
                i++;
            }
            else
            {
                j--;
            }                       
        }
        return maxArea;
    }
}
