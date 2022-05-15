// Time Complexity :O(n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no
class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int max=Integer.MIN_VALUE;
        int small=0;//smaller height decides the area
        while(start<=end)
        {
            if(height[start]<height[end])
            {
                small=height[start];
                max=Math.max(max,(end-start)*small);//end-start gives breadth
                start++;
            }
            else
            {
                small=height[end];
                max=Math.max(max,(end-start)*small);
                end--;
            }
            
        }
        return max;
    }
}