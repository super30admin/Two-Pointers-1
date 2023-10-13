// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class ContanierWithMostWater {
    class Solution {
        public int maxArea(int[] height) {
            int maxArea = 0;
            int n = height.length;
            int l = 0, r = n-1;

            while(l < r){
                int curArea = Math.min(height[l], height[r]) * (r - l);
                if(curArea > maxArea) maxArea = curArea;

                if(height[l] < height[r]){
                    l++;
                }
                else{
                    r--;
                }
            }

            return maxArea;
        }
    }
}
