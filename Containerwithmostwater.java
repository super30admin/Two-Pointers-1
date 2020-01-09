// space : O(1)
// time : O(n)
// paased all testcase on leetcode
class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int low=0;
        int high=height.length-1;
        while(low<high)
        {
            max=Math.max(max,(Math.min(height[low],height[high]))*(high-low)); // compare local with global
            if(height[low]<height[high]) // setting new low and high that is ignoring less height
            {
                low++;
            }
            else{
                high--;
            }
        }
        return max;
    }
}