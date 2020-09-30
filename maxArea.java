class Solution {

    // time:O(n) Space: O(1)
    // taking two pointers checking area by mutlipying the distance and the lowest height.
    // if left side is lo the increase the left check the area  or if right side is less then left then increase the right and check area.
    public int maxArea(int[] height) {
       
        
        int max = Integer.MIN_VALUE;
        
        int left = 0;
        int right = height.length-1;
        
        while(left<right){
            if(height[left] < height[right]){
                
                max = Math.max(height[left] *(right-left) , max);
                
                left++;
            }
            else if(height[left] > height[right]){
                
                max = Math.max(height[right] *(right-left) , max);
                
                right--;
            }
            
            else{
                  max = Math.max(height[right] *(right-left) , max);
                right--;
            }
            
        }
        
        
        
        return max;
    }
}