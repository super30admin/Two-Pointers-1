class Solution {
    //Time O(N)
    //Space O(1)
    public int maxArea(int[] height) {
        if(height == null || height.length == 0)
        {
            return 0;
        }
        int low = 0 , high = height.length-1 , max = 0;
        while(low < high)
        {
            max = Math.max(max , (high-low)*Math.min(height[low] , height[high]));
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