//TC= O(n)
//SC = O(1)
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while(left<=right)
        {
            int curr = (right-left)*Math.min(height[left], height[right]);
            maxArea = Math.max(curr, maxArea);
            if(height[left] < height[right]) left++;
            else right--;
        }
        return maxArea;
    }
}