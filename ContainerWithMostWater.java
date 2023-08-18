// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
 

class Solution {
    public int maxArea(int[] height) {

        int n= height.length;
        int left=0;
        int right= n-1;
        int max=0;

        while(left<right)
        {
            int currArea= Math.min(height[left],height[right])* (right-left); //Height * width
            max= Math.max(max, currArea);

            if(height[left]<=height[right]) left++;
            else right--;
        }
        return max;
    }
        
}
