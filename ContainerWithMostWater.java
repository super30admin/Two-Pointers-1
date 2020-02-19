// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/*
Approach:
=========
1. Use 2 pointers low and high, to track width of container. 
2. Container height would be min of heights of both. 
3. Now, area would be height*width. So, to maximize, compare max so far and current area.
4. Update low if ht[low] less than ht[high] else update low. Return max when 2 pointers cross
*/

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length < 2) return 0;
        
        int low = 0, high = height.length - 1;
        int max = 0;
        
        while( low < high) {
            int area = Math.min(height[low], height[high])*(high - low); //high - low is width, min(h[low],h[high]) is min height container
            max = Math.max(max, area); //Update max if area greater than max
            if(height[low] < height[high]) low++; //update low if value at low less than at high
            else high--; //ht[high] <= ht[low] => high--
        }
        return max;
    }
}