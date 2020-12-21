public class Solution {
    public int MaxArea(int[] height) {
        int maxarea =0,l=0,r=height.Length-1;
        while(l<r)
        {
            maxarea = Math.Max(maxarea,Math.Min(height[l],height[r]) * (r-l));
            if(height[l] < height[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return maxarea;
        
    }
}
