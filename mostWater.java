// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
class Solution {
    public int maxArea(int[] height) {
        int l=0, r = height.length-1;
        int max = 0;
        while(l<r){
            max = Math.max(max, Math.min(height[l],height[r])*(r-l));
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}