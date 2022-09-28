// TC : O(n)
// SC : O(1)
class Solution {
    public int maxArea(int[] height) {
        
        if(height == null || height.length == 0) return 0;
        
        int left, right, max = Integer.MIN_VALUE;
        
        right = height.length - 1;
        
        left = 0;
        
        while(left < right) {
            
            max = Math.max(max, (right-left)*
                                 Math.min(height[left],height[right]));
            if(height[left] >= height[right])
                right--;
            else
                left++;
        }
       return max; 
    }
}
