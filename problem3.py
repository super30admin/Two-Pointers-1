class Solution:
    def maxArea(self, height: List[int]) -> int:

        low = 0
        high = len(height)-1
        area = 0
        while(low<high):
            area = max(area,(high-low)*min(height[low],height[high]))
            if height[low]<height[high]:
                low = low + 1
            else:
                high = high - 1

        return area
        
