// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

//Problem statement: https://leetcode.com/problems/container-with-most-water/

class Problem3 {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while(left < right){
            int capacity = 0;

            if(height[left] < height[right]){
                capacity = height[left] * (right - left);
                max = Math.max(capacity, max);
                left++;
            }else{
                capacity = height[right] * (right - left);
                max = Math.max(capacity, max);
                right--;
            }

        }
        return max;

    }
}