// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
public class Solution3 {
    public int maxArea(int[] height) {
        if(height==null || height.length==0)
            return -1;
        int max=Integer.MIN_VALUE;
        // two pointer approach 
        int low=0;
        int high=height.length-1;
        while(low<high){
            //maximize the area by choosing all possible combinations
            // taking min because it can hold water till the lowest height in the container
            max=Math.max(max,(high-low)*Math.min(height[low],height[high]));

            // moving towards the space where probabbility of finding max height that is max area can be achieved
            if(height[low]<=height[high])
                low++;
            else
                high--;
        }
        return max;
    } 
}
