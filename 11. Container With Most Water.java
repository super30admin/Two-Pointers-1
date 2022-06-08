// Time complexity: O(n)
//space complexity:O(1)
class Solution {
    public int maxArea(int[] height) {
        // check null case
        if(height==null || height.length==0) return 0;
        int n= height.length;
        int left=0;
        int right=n-1;
        int max=0;
        while(left<right)
        {
            max=Math.max(max,Math.min(height[left],height[right])*(right-left));

        if(height[left]<=height[right])
        {
            left++;
        }
        else
        {
            right--;
        }
        }
         return max;

    }
}