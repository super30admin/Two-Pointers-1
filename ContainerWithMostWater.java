// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        int i=0, j= height.length-1, max = -1;
        while(i<j){
            max = Math.max(max, Math.min(height[i], height[j])* (j-i));
            if(height[i]<height[j]) i++;
            else j--;
        }
        return max;
    }
}