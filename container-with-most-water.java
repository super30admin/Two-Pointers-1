// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Keep calculating area of water which changes with change in height of of its ends.

public int maxArea(int[] height) {
    int max = 0;
    int l = 0;
    int r = height.length-1;
    while(l<r){
        int area = (r-l)*Math.min(height[l],height[r]);
        if(area >max){
            max = area;
        }
        if(height[l]>height[r]){
            r--;
        }else{
            l++;
        }
    }
    return max;
}