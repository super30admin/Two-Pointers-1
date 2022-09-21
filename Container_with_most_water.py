# Time complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        i = 0
        j = len(height)-1
        
        res = 0
        
        while i < j:
            res = max(res, min(height[i], height[j]) * (j - i))
            
            
            if height[i] < height[j]:
                i = i + 1
                
            elif height[i] >= height[j]:
                j = j-1
                
        return res
