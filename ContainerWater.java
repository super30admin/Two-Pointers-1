// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int start = 0;
        int end = height.length-1;
        int max = 0;
        while(start<end){
            int diff = end - start;
            int min = Math.min(height[start],height[end]);
            
            int area = diff * min;
            max = Math.max(max,area);
            if(height[start]<=height[end]){
                start++;
            }
            else {
                end--;
            }
        }
        return max; 
    }
}