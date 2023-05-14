#Time Complexity:O(n)
#Space Complexity:O(1)

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        low=0
        high=len(height)-1
        area=0
        while(low<high):
            area=max(area,min(height[low],height[high])*(high-low))
            if height[low]<height[high]:
                low=low+1
            else:
                high=high-1
        return area