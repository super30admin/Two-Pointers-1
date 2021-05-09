//Time complexity - O(n)
// Space complexity - O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
//Solved using brute force and 2 pointer approach
class Solution {
    public int maxArea(int[] height) {
        
        //starting with brute force approach and then implementing pointer approach
        
       // brute force
        
        int result = 0;
  /*      for(int i = 0; i < height.length - 1; i ++){
            
            for(int j = i + 1; j < height.length; j ++){
                
                int h1 = Math.min(height[i],height[j]);
                int area = h1 * (j - i);
                result = Math.max(result,area);
                
            }
        } */ //brute force ends. Time limit exceeded
        //using 2 pointer approach
        int left = 0;
        int right = height.length - 1;
        
        while(left < right){
            
             int h1 = Math.min(height[left],height[right]);
                int area = h1 * (right - left);
                result = Math.max(result,area);
            
            if(height[left] <= height[right]){
                
                left ++;
            }
            
            else right --;
            
        }
        
        return result;
    }
}