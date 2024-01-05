// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/*Approach:
*  1. Brute Force: O(n^2)
        take first loop for start of container,
            and another loop for end of container
* 
*  2. Better: Two pointer
        Initially, start and end are at two ends.
            move close to each other.
        area = width(distance between two pointers) * 
                    min(height[start], height[end])
* 
*   As two pointers move opposite side, width will decrease.
       so,  max area is directly proportional to large heights.
    
    Therefore, to get max area, move pointers towards max heights.
     */
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int n = height.length;
        int l = 0; 
        int r = n-1;
        while(l < r)
        {   
            int curr = Math.min(height[l],height[r]) * (r-l);
            max = Math.max(curr, max);
            if(height[l] < height[r]) l++;   //pointer move to larger height
            else r--;
        }
        return max;
    }
}