// Time Complexity : O(n) -- 2 ptr approach where n is the length of the input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// Brute Force - TC: O(n^3) and SC: O(1)
class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        int max = -9999;
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                int curr = (j-i) * Math.min(height[i],height[j]);
                max = Math.max(curr,max);
            }
        }
        return max;
    }
}

/**
 * max(Water stored) -- width * height where width is j-i and and height is min heights of j and i
 * if by moving j and i inside, the width decreases, height has to be increasede so move the min height and calcuate the max cap
 */
class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        int max = -9999;
        int low = 0, high = height.length-1;
        while(low <= high){
            max = Math.max(max, (high-low)*Math.min(height[low],height[high]));
            if(height[high] < height[low])
                high--;
            else
                low++;
        }
        return max;
    }
}