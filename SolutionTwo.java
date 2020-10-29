// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :nopes

class SolutionTwo {
    public int maxArea(int[] height) {

        if(height==null||height.length==0)
            return 0;

        int max=0;
        int left=0;
        int right=height.length-1;

        while(left<right)
        {
            if(height[left]<height[right])
            {
                max=Math.max(max,height[left]*(right-left));
                left++;
            }
            else
            {
                max=Math.max(max,height[right]*(right-left));
                right--;
            }
        }

        return max;
    }
}