Time Complexity: O(n)
Space Complexity: Constant
Ran successfully on leetcode?: yes


class Solution {
    public int maxArea(int[] height) {
        int low = 0, high = height.length - 1;
        int area = 0;
        
        while(low < high){
            area = Math.max(area, Math.min(height[low], height[high]) * (high - low));
            
            if(height[low] <= height[high]) low++;
            else high--;
        }
        
        return area;
    }
}
