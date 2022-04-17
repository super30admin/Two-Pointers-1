//TC : O(n) SC: O(1)
class Solution {
    public int maxArea(int[] height) {

        if(height == null || height.length == 0) return -1;
        int l = height.length;
        int max = 0;
        int left = 0;
        int right = l-1;

        while(right > left)
        {
            int h = Math.min(height[right],height[left]);
            max = Math.max(max,h*(right-left));

            if(height[right] >= height[left])
                left++;
            else
                right--;

        }

        return max;
    }
}