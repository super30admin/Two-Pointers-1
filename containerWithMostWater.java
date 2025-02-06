// Problem3 (https://leetcode.com/problems/container-with-most-water/)

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach in three sentences only
/*
 * Here two pointer method is used. left pointer is at index 0 and right pointer is at index n-1. Take maximum area for that take minimum of
 * element at left and right and multiply with width i.e., right - left. Then if left element is less than right increase left else
 * increase right. Finally return maximum area.   
 */

class Solution {
    public int maxArea(int[] height) {
     if(height.length == 1 || height == null) return 0;
     int n = height.length;
     int l = 0;
     int r = n-1;
     int max = 0;
     while(l<r){
        int area = Math.min(height[l],height[r]) * (r-l);
        max = Math.max(max, area);
        if(height[l]<height[r]){ 
            l++;
        }
        else{
            r--;
        }
     } 
     return max;  
    }
}
