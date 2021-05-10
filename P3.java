//time- o(n) single pass
//space-o(1)
//passed in leetcode- yes

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max_water=0;
        while(left<=right)
        {
            max_water= Math.max(max_water,((right-left)* Math.min(height[left],height[right])));// calc area
            if(height[left]<height[right])//if left is smaller move away rom left
            {
                left++;
            }
            else
            {
                right--;//else move away from right
            }
            
        }
        
        return max_water;
        
    }
}