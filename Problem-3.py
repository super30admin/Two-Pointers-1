'''
    Time Complexity: O(n)
    Space Complexity: O(1)
'''
class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        low, high = 0, n-1
        maximum = 0

        while low < high:
            if height[low] < height[high]:
                area = height[low]*(high-low)
                low += 1
            elif height[high] < height[low]:
                area = height[high]*(high-low)
                high -= 1
            else:
                area = height[low]*(high-low)
                low += 1
                high -= 1

            maximum = max(area, maximum)
        
        return maximum

        