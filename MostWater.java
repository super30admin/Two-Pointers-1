// Optimized Approach : 2 Pointers

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0)
            return 0;
        
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        
        while(left < right){
            //calculate the area
            int area = Math.min(height[left], height[right]) * (right - left);
            //compare the area with max
            max = Math.max(max, area);
            
            if(height[left] < height[right])
                left++;
            else if(height[right] < height[left])
                right--;
            else{
                left++;
                right--;
            }
        }
        return max;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)