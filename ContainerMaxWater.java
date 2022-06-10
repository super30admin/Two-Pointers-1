// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class ContainerMaxWater {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length-1;
        int max = Integer.MIN_VALUE;
        
        while(left<right) {
            max = Math.max(max,Math.min(height[right],height[left])*(right-left));
            
            // since smaller height is constraining height, increase/decrease the pointer which has smaller height. 
            if(height[left]<=height[right])
                left++;
            else
                right--;
        }
        
        return max;
    }
}
