//Approach-1: Using the nested loops
//Approach-2: Using the two pointer approach
//Overall Time Complexity: O(N)
//Overall Space Complexity: O(1)
class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        
        int l = 0;
        int r = height.length - 1;
        int maxA = Integer.MIN_VALUE;
        
        while(l < r){
            maxA = Math.max(maxA, Math.min(height[l], height[r]) * (r - l));
            if(height[l] <= height[r]){
                l++;
            }else{
                r--;
            }
        }
        
        return maxA;
    }
}