//Time complexity: O(n)
//Space complexity: O(1)
//Leetcode: Yes

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int len = height.length;
        int right = len - 1;
        int left = 0;
        int area = 0;

        while(left<right){
            area = Math.min(height[left],height[right])*(right-left);
            max = Math.max(max, area);
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