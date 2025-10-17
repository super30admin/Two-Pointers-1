// Time Complexity : O(n).
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach : The approach is to have two pointers at left end and right end and squeeze them based on which ever value is lower. The maximum
// amount of water is calculated by length * breadth as it's like a rectangle. Length will be minimum of left end and right end as only
// that level of water can be stored and breadth will be difference of right and left pointer. Maximum area will the max of all areas calculated.


class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int output = Integer.MIN_VALUE;
        int l = 0;//start of array
        int r = n-1;//end of array
        while(l<r){ //until both are not crossed with each other
            output = Math.max(output, Math.min(height[l],height[r]) * (r-l)); //max of all areas and calculation of area.
            if(height[l] < height[r]){
                l++;
            } else{
                r--;
            }
        }
        return output;
    }
}