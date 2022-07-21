// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        if (height.length == 0 || height==null){
            return 0;
        }
        int left=0;
        int right=height.length-1;
        int maximum=0;
        while (left<right){
            maximum=Math.max(maximum,Math.min(height[right],height[left]) * Math.abs(right-left));
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maximum;
    }
}