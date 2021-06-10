// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

class ContainerWithMostWater{
    public int maxArea(int[] height) {
        int max = 0;
        int left =0;
        int right = height.length -1;
        while(left<right){
            int minHeight = Math.min(height[left], height[right]);
            int area = (right-left) * minHeight;
            max = Math.max(max, area);
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return max;
    }
}