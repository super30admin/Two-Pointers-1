// Time Complexity : O(n)
// Space Complexity : O(1) , no extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//To find the maximum area, we need maximum width, so we shall keep left and right pointers simultaneously at 0 and last index
//if height of left is lesser, then we shall move towards right so that we may find higher height
//else move the right pointer to left side, to find higher height.
//return the max in the last

class Solution {
    public int maxArea(int[] height) {
        if (height==null||height.length==0){
            return 0;
        }
        int left=0; int right=height.length-1;
        int max=Integer.MIN_VALUE;
        int currArea=0;
        
        while(left<right){
            if(height[left]<height[right]){
                currArea = height[left] * (right-left);
                left++;
            }
            else{
                currArea = height[right] * (right-left);
                right--;
            }
            max=Math.max(max,currArea);
        }
        return max==Integer.MIN_VALUE ? 0:max;
    }
}