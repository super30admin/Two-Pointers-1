// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach : I use two pointers from left and right, I use the formula of area -> height x width, width is right - left and height is the lowest of heigh[left] and height[rigth], as otherwise the water will overflow. I also use a greedy approach to maximize the overall water by moving the index with lower height ahead. 

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            if(height[left]<height[right]){
                max = Math.max(max, height[left]*(right-left));
                left++;
            }else{
                max = Math.max(max, height[right]*(right-left));
                right--;
            }
        }
        return max;
    }
}