#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        low = 0
        high = len(height)-1
        maxm = 0
        while low<high:
            if height[low] <= height[high]:
                area = min(height[low],height[high])*(high-low)
                if maxm<area:
                    maxm = area
                low += 1
                
            elif height[high] < height[low]:
                area = min(height[low],height[high])*(high-low)
                if maxm<area:
                    maxm = area
                high -= 1
        return maxm