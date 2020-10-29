"""
Time complexity O(n)
Space complexity O(1)

First and last line is initialized with low and high pointer 

We compute high - low, the width of the current container, and take min height index, the water level that this container can support. Multiply them to get how much water this container can hold and update max1.
"""

class Solution_cointainer:
    def maxArea(self, height: List[int]) -> int:
        if height is None or len(height)==0:
            return 0
        max1=0
        low=0
        high=len(height)-1
        
        while(low<high):
            if(height[low]<height[high]):
                max1=max(max1,height[low]*(high-low))
                low=low+1
            else:
                max1=max(max1,height[high]*(high-low))
                high=high-1
        return max1
        