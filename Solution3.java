// Time Complexity : O(N)
// Space Complexity :
// Did this code successfully run on Leetcode : Y
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {

        int start = 0;
        int end = height.length-1;
        int max = Integer.MIN_VALUE;

        while(start<end){
            //to get max water always move in the directions of greater height[end]
            if(height[start]<height[end]){
                int waterLevel = calculateWater(start, end, height);
                max = Math.max(max,waterLevel);
                start++;
            }else{
                int waterLevel = calculateWater(start, end, height);
                max = Math.max(max,waterLevel);
                end--;
            }
        }

        return max;
    }

    public int calculateWater(int start, int end, int[] height){
        int minHeight = Math.min(height[start],height[end]);
        int water = minHeight * (end-start);
        return water;
    }
}