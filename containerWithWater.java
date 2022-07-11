//Amazon interview
//TC= O(n)
//Sc= O(1)
//Optimize approach:given array selecting the max array element value based on the comparing with left and right .At least 2 entries should be their.

//Brute force:using 2 pointers  can be done but time limit exceeded.O(n^2),Sc=O(1)
class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        
        int left=0;
        int right = height.length-1;
        int max = 0;
        
        while(left<=right){
            max = Math.max(max, Math.min(height[left], height[right]) * (right-left));
            if(height[left]<height[right]){
                left++;
            } else if(height[right]<height[left]){
                right--;
            }
            else{
                left++;
                right--;
            }
        }
        return max;
    }
}