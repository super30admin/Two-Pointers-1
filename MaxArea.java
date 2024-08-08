// Problem 11. Container With Most Water
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
class MaxArea {
    public int maxArea(int[] height) {
        int max = 0;
        int n = height.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            if(height[left] < height[right]){
                max = Math.max(max, (right-left)*height[left]);
                left++;
            }else{
                max = Math.max(max, (right-left)*height[right]);
                right--;
            }
        }
        return max;
    }
}
