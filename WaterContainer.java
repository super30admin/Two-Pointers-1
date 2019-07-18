//Time Complexity:O(n)
//SPace Complexity: O(1)
//We need to maximixe height w.r.t. width . The width is max in the begining and we increase low or high height whichever has higher 
//has higher height

class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0, low = 0, high = height.length - 1;
        
        while(low<high)
        {
            int area= 0;
           // maxarea = Math.max(maxarea, r*Math.min(height[l],height[r]));
           
            if (height[low] < height[high])
            {
                maxarea = Math.max(maxarea, (high-low)*height[low]); //We have to make container with lesser one.
                low++;
            }
            else
            {
                maxarea = Math.max(maxarea, (high-low)*height[high]);
                high--;
            }
        }
        
        return maxarea;
    }
}
