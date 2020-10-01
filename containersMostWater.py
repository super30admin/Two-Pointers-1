"""
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
"""
class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        first = 0
        last = len(height) - 1
        maxArea = float("-inf")
        
        while(first <= last):
            
            # Area of this tank
            heightOfTank = min(height[first], height[last])
            widthOfTank = last - first
            areaOfTank = heightOfTank * widthOfTank
            
            # Check if this tank is max tank
            maxArea = max(maxArea, areaOfTank)
            
            # Move the last pointer if last < first
            if(height[first] > height[last]):
                last -= 1
            else:
                first += 1
                
        return maxArea