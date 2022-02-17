// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
//Take two pointer ot the start and end of array
// Calculate the area, in a while loop check the area
// Increment pointer i if height at i is lower the height at j else do reverse
// Keep track of max and return max when all the iterations are over.
class Solution {
    public int maxArea(int[] height) {
        int max = Math.min(height[0],height[1]) ;
        int i = 0;
        int j = height.length-1;
        while(i < j){
            int area = Math.min(height[i],height[j]) * (j-i);
            max = Math.max(area, max);
            if(height[i] > height[j])
                j--;
            else
                i++;
        }
        return max;
    }
}