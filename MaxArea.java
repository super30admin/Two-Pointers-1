// Time Complexity :O(N) n are the number of elements in the given array.
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No.


// Your code here along with comments explaining your approach:
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max= 0;
        while(left<right){
            max=Math.max(max,(Math.min(height[right],height[left]))*(right-left));
            if(height[left]<height[right])
                left++;
            else
                right--;
                
        }
        return max;
    }
}