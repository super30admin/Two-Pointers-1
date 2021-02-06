// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
// use two pointers one on left most, one on right most to maximize area, now area = min(height[left], height[right])*(right-left)
// now greedily move the smaller height bar

class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length==0)
            return 0;
        
        int left = 0;
        int right = height.length-1;
        int result = Integer.MIN_VALUE;
        
        while(left<right){
            result = Math.max(Math.min(height[left], height[right]) * (right-left), result);
            
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        
        return result;
    }
}