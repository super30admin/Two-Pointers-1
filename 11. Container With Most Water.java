//Time -O(n)
class Solution {
    public int maxArea(int[] height) {
        if(height==null||height.length==0)
        {
            return 0;
        }
        int left=0;
        int max=Integer.MIN_VALUE;
        int right=height.length-1;
        int curArea=0;

        while(left<right)
        {
            if(height[left]<height[right])
            {
                curArea=height[left]*(right-left);
                left++;
            }
            else{
                curArea=height[right]*(right-left);
                right--;
            }
            max=Math.max(max,curArea);
        }
        return max;
    }
}