// Bruteforce Approach
// TC: O(n^2) n: length of the array
// SC: O(1)
class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max_area = Integer.MIN_VALUE;
        for(int i=0;i<height.length;i++) {
            for(int j=i+1;j<height.length;j++) {
                int area = (j-i) * Math.min(height[i],height[j]);
                if(area>max_area)
                    max_area = area;
            }
        }
        return max_area;
    }
}

// Two-pointer technique
//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length-1;
        int max_area = Integer.MIN_VALUE;
        while(low<high) {
            int area = (high-low)*Math.min(height[low],height[high]);
            if(area > max_area) {
                max_area = area;
            }
            if(height[low] <= height[high]) low++;
            else high--;
        }
        return max_area;
    }
}