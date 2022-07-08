// TC: O(n)
// SC: O(1)

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length ==0) return 0;
        
        // initialising two pointers
        int left = 0;
        int right = height.length -1;
        int max=0;
        
        while(left<=right){
            // finding the maximum capacity
            max = Math.max(max, Math.min(height[left],height[right])*(right-left)); 
            // if one container is smaller increase the pointer to next container as we have                to maximise the capacity
            
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}