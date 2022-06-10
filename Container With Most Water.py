# time complexity is o(n), where n is the size of the input
# space complexity is o(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        if(not len(height)):
            return 0
        low = 0
        high = len(height) - 1
        area = float("-inf")
        while(low < high):
            area = max(area, min(height[low], height[high])*(high-low))
            if(height[low] < height[high]):
                low += 1
            else:
                high -= 1
        return area
            
       