// Time complexity : O(n)
// Space complexity : O(1)
// Ran on leetcode : yes
// Any issues : no

class Solution {
    public int maxArea(int[] height) {
    int low = 0;
    int high = height.length-1;
    int area=0;    
    while(low<high)
    {
        area = Math.max(area, Math.min(height[low],height[high])*(high-low));
        
        if(height[high]<height[low])
            high--;
        else
            low++;
      
    }
        return area;
    }
}