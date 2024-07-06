//Time Complexity - O(n) as we iterate using two pointers
//Space Complexity - O(1) no extra space other than variables

class Solution {
    public int maxArea(int[] height) {
        int maxAmount=0;
        int left=0;
        int right=height.length-1;

        while(left<right)
        {
            int waterHeight= Math.min(height[left],height[right])*(right-left);
            maxAmount=Math.max(maxAmount,waterHeight);
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return maxAmount;
    }
}