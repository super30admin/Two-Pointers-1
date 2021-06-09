// 11. Container With Most Water

class Solution {
    public int maxArea(int[] height) {
        
        if(height == null || height.length == 0)
            return 0;
        int low = 0, high = height.length - 1;
        int max = Integer.MIN_VALUE;
        while(low < high)
        {
            max = Math.max(max,Math.min(height[low], height[high]) * (high - low));
            if(height[low] < height[high])
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

/*
Complexity Analysis

Time complexity : 
O(n). Single pass.

Space complexity : 
O(1). Constant space is used.

*/