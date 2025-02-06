//The approach here is to take two pointers at each end of the array and calculate the area by considering the minimum of heights and the distance between the pointers
//We keep track of the maximum area and keep shrinking the pointers
//Time Complexity: O(n)
//Space Complexity:O(1)
class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int area = 0;
        int left = 0;
        int right = height.length-1;
        while(left < right){
            int minHeight = Math.min(height[left], height[right]);
            area = minHeight * (right - left);
            max = Math.max(area, max);
            if(height[left]>height[right]){
                right--;
            } else {
                left++;
            }
        }
        
        return max;
    }
}