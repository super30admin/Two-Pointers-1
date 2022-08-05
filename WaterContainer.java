// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public int maxArea(int[] height) {
        int start = 0,end = height.length-1;
        int max = Integer.MIN_VALUE;
        while(start<end){
            if(height[start]<height[end]){
                max = Math.max(max,height[start]*(end-start));
                start++;
            }else{
                max = Math.max(max,height[end]*(end-start));
                end--;
            }
        }
        return max;  
    }
}
