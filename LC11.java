//Time Complexity : O(n)
//Space Complexity : O(1)

class Solution {
    public int maxArea(int[] height) {
        
        int low = 0;
        int high = height.length-1;
        
        int area = Integer.MIN_VALUE;
        
        while(low<=high)
        {
            area = Math.max(area,Math.min(height[low],height[high])*(high-low));
            
            if(height[low]<height[high])
            {
                low++;
            }
            else
            {
                high--;
            }
        }
        
        return area;
    }
}