/*
class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height is None or len(height) == 0:
            return 0
        
        area = 0
        low, high = 0, len(height) - 1
        while low < high:
            area = max(area, min(height[low], height[high]) * (high - low))
            if height[low] < height[high]:
                low += 1
            else:
                high -= 1
        return area
*/

// Time Complexity : O(n) where n is array size
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: I maintained two pointers and everytime moved that pointer
// who had smaller height

class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0)
            return 0;
        
        int low = 0, high = height.length - 1;
        int area = 0;
        while (low < high){
            area = Math.max(area, Math.min(height[low], height[high]) * (high - low));
            
            if (height[low] < height[high]){
                low ++;
            }
            else{
                high --;
            }
        }
        return area;
    }
}
        