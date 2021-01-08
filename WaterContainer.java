// Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class WaterContainer {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0 || height.length == 1)
            return 0;

        int max = 0;

        int start = 0, end = height.length -1;

        while(start < end){
            max = Math.max(max, (end - start) * Math.min(height[start], height[end]));
            if(height[start] < height[end])
                start++;
            else
                end--;
        }

        return max;
    }
}