// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int result = 0;
        while(l != r){
            result = Math.max(result,(r - l) * Math.min(height[l],height[r]));
            //increment the lesser value side to check for possible better results
            if(height[l] < height[r])
                l++;
            else
                r--;
        }
        return result;
    }
}