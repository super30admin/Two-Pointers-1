public class Solution {
    public int MaxArea(int[] height) {
        int low=0;
        int high=height.Length-1;
        int maxArea = 0;
        while(low<=high)
        {
            int width = (high+1)-(low+1);
            int length;
            if(height[low]<height[high])
            {
                length = height[low];
                low++;
            }
            else
            {
                length = height[high];
                high--;
            }
            maxArea = Math.Max(maxArea,width*length);

        }

        return maxArea;
    }
}