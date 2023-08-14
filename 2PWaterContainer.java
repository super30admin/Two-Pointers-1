//TC:O(n)
//SC:O(1)

class Solution {
    public int maxArea(int[] height) {
        int n= height.length;
        int left=0;
        int right= n-1;
        int max=0;
        
        while(left<right)
        {
            int currArea= Math.min(height[left],height[right])* 
(right-left);
            max= Math.max(max, currArea);
            
            if(height[left]<=height[right]) left++;
            else right--;
        }
        return max;
    }
}
