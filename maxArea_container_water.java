// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
    public int maxArea(int[] height) {
        
        //Two pointer approach
        int left = 0;
        int right =  height.length - 1;
        
        int maxArea = Integer.MIN_VALUE;
        
        while (left < right){
            
            
            maxArea =  Math.max(maxArea, Math.min(height[left] , height[right]) * (right - left));
            
            // If minimum is left, move the left to find the max area
            if (height[left] < height[right]){
                
                left++;
            }
            
            // If minimum is right, move the right to find the max area
            else if (height[left] > height[right]){
                
                right--;
                
            }
            else{
                
                // Any pointer can be moved (left/right)
                left++;
            }
            
            
            
        }
          
        return maxArea;
    }
    
}