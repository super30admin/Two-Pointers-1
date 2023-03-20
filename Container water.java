// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int max = Integer.MIN_VALUE;
        int right = height.length-1;
        while(left<right){
            int area = Math.min(height[left],height[right])*(right-left);
            if(area>max){
                max= area;
            }
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