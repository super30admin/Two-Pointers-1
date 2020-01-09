/*********** Time Complexity: O(n) ************/
/*********** Space Complexity: O(1) ************/

class Solution {
    
    public int maxArea(int[] height) {      
        //base case
        if(height == null && height.length == 0)
            return 0;
        
        int area = 0, left = 0, right = height.length - 1;
        while (left < right) 
        {
            //area = length*breadth
            area = Math.max(area, Math.min(height[left], height[right]) * (right - left));
            
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return area;
    }
}