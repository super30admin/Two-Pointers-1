// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :Yes

public class Solution {
    public int MaxArea(int[] height) {
        int max =0;
        int n = height.Length;
        int  l=0; int  r= n-1;

        while(l < r)
        {
            int currArea = Math.Min(height[l], height[r]) * (r-l);
            max = Math.Max(max, currArea);
            if(height[l] < height[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return max;
    }
}
