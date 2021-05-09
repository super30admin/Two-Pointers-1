from typing import  List
class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height == None or len(height) == 0: return
        maxArea, left, right = 0, 0, len(height) - 1
        while left < right:
            maxArea = max(maxArea, (right - left) * min(height[right], height[left]))
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        return maxArea    


 #time:- O(n)
 #space:-O(1)