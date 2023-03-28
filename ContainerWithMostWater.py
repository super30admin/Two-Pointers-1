# Time Complexity : O(n)
# Space Complexity : O(1)
from typing import List

class Solution:
    def maxArea(self, height: List[int]) -> int:
        left, right = 0, len(height) - 1
        max_area = 0
        
        while left < right:
            # Calculate the current area
            current_area = min(height[left], height[right]) * (right - left)
            
            # Update max area if current area is greater
            max_area = max(max_area, current_area)
            
            # Move the pointer with lesser height
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        
        return max_area
s1 = Solution()
height = [1,8,6,2,5,4,8,3,7]
ans = s1.maxArea(height)
print("Output : ", ans)