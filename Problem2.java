// Problem 11 leet
// Time Complexity : O(N)
// Space Complexity : O(1)
// It runs successfully on Leetcode

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0)
            return 0;
        int low = 0, high = height.length - 1;
        int max = Integer.MIN_VALUE;
        while(low < high){
            max = Math.max(max, Math.min(height[low], height[high]) * (high - low));
            if(height[low] < height[high]){
                low++;
            }
            else{
                high--;
            }
        }
            return max;
        
    }
}
