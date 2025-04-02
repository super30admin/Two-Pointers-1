class Solution {
    public int maxArea(int[] height)
    {
        int low=0;
        int high=height.length-1;

        int maxArea=0;

        if(height.length == 0 || height.length == 1) return 0;

        while(low<high)
        {
            
                int length = Math.min(height[low],height[high]);
                int bredth = high - low;

                int area = length * bredth;
                maxArea = Math.max(maxArea,area);

                if(height[low]<= height[high])
                {
                    low++;
                }
                else
                {
                    high--;
                }
        }
        return maxArea;
    }
}