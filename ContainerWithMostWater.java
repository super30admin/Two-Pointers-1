//Time Complexity: O(N)
//Space Complexity: O(1)
class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int ans = 0;
        while(i < j)
        {
            if(height[i] > height[j])
            {
                ans = Math.max(ans, Math.min(height[i],height[j]) * (j - i));
                j--;

            }
            else
            {
                ans = Math.max(ans, Math.min(height[i],height[j]) * (j - i));
                i++;
            }
        }return ans;
    }
}