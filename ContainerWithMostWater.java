class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length-1;
        while(left < right){
            max = Math.max(max, Math.min(height[left],height[right])*(right-left));
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}