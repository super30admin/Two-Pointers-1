// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// We use a two pointer approach to eliminate nested iterations. We start with low=0, high=length-1 which gives us max width
// In the consequent iterations we move the smaller pointer towards the center as it may give us a larger area, i.e,
// we are moving the pointer of the height that is constraining the area

class Solution {
    public int maxArea(int[] height) {
        int low = 0, high = height.length-1;
        int maxArea = 0;
        while(low < high){
            int width = high-low;
            int area = Math.min(height[low],height[high]) * width;
            if(area > maxArea)
                maxArea = area;
            if(height[low]<height[high])
                low++;
            else    
                high--;
        }
        return maxArea;
    }
}