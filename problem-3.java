// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            if(height[left]<=height[right]){
                max=Math.max(max, height[left]*(right-left));
                left++;
            }
            else{
                max=Math.max(max, height[right]*(right-left));
                right--;
            }
        }
        return max;
    }
}
