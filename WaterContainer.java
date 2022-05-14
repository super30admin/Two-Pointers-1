// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

public class WaterContainer {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length -1;
        int max = Integer.MIN_VALUE;
        while(start < end){
            max = Math.max(max, Math.min(height[start], height[end]) * (end - start));
            if(height[start] > height[end]){
                end--;
            }
            else{
                start++;
            }
        }
        return max;
    }
    
}