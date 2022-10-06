#Time Complexity: O(n)
#Space Complexity: O(1)
#Did it run on leetcode: Yes
 
class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxArea = 0
        n = len(height)
        low, high = 0, n - 1
        while low < high:
            currArea = min(height[low], height[high])*(high-low)
            maxArea = max(maxArea, currArea)
            if height[high] <= height[low]:
                high-= 1
            else:
                low += 1
        return maxArea