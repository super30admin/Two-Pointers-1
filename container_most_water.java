// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 
// Explaination : We use two pointers to calculate the area and 
// move the pointer with smaller height to find the maximum area.
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l =0;
        int r = n-1;
        int max=0;
        while(l<r){
            int curr = Math.min(height[l],height[r]);
            int area = curr*(r-l);
            max= Math.max(max,area);
            if(height[l]<=height[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}