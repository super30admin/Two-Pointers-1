// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
    //Maintaing two pointers one at begining and one at end.
    //Calculate the water then can hold and update the max.
    //Increase the pointer whichever has low value.
class Solution {
    public int maxArea(int[] height) {
        
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right)
        {
            max=Math.max(max,(Math.min(height[left],height[right])*(right-left)));
            if(height[left]>height[right])
                right--;
            else
                left++;
        }
        return max;
    }
}