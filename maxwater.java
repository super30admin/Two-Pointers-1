// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach: first declared height of the container as the minimum of the two heights at the low and high pointers. Then calculated the width as the difference between the two pointers. Calculated area and updated max area if current area is greater. Moved the pointer with smaller height towards the other pointer to try and find a larger height for next iteration.
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int low = 0, high = n-1;
        int area = 0;

        while(low < high){
            int h = 0;
            int w = high - low;

            if(height[low] < height[high]){
                h = height[low];
                low++;
            }else{
                h = height[high];
                high--;
            }   

            area = Math.max(area, h*w);
        }

        return area;
    }
}

