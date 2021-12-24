//T.C = O(n)
//S.c= O(1)
class Solution {
    public int maxArea(int[] height) {
        
        int low = 0;
        int high = height.length-1;
        int max=0;
        
        while(low<=high)
        {
            max = Math.max(max,Math.min(height[high],height[low])* (high-low));
            if(height[low]>=height[high])
            {
                high--;
            }
            else
            {
                low++;
            }
        }
        
        return max;
        
    }
}