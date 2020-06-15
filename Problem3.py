from typing import List

"""

    Student : Shahreen Shahjahan Psyche
    Time Complexity : O(N)
    Space Complexity : O(1)

"""

class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        # edge case
        if not height:
            return 0
        
        max_area = 0
        low = 0
        high = len(height) - 1
        
        # Go away from the smaller height. Keep the big one [Greedy]
        while(low<high):
            width = high - low
            h = min(height[high], height[low])
            area = width * h 
            max_area = max(max_area, area)
            if height[low] > height[high]:
                high -= 1
            else:
                low += 1
        
        return max_area
            