//Time Complexity - O(N)
//Space Complexity - O(1)
class Solution {
    public int maxArea(int[] height) {
        int maxArea ;
        int left = 0;
        int n = height.length;
        int right = n-1;
        maxArea = Math.min(height[left],height[right])*(right - left);
        while(left < right){
            if(height[left] <= height[right]){
                maxArea = Math.max(maxArea,height[left]*(right-left));
                left++;
            }else{
                maxArea = Math.max(maxArea,height[right]*(right-left));
                right--;
            }
        }

        return maxArea;
    }
}