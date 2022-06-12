//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        if(height == null || n == 0) return 0;
        int low = 0; int high = n - 1;
        int maxArea = 0;
        while (low < high) 
        {
            maxArea = Math.max(maxArea, Math.min(height[low], height[high]) * (high - low));             if(height[low] < height[high])
            {
                low++;
            }
            else
            {
                high--;
            }
        }
        return maxArea; 
    }
}
