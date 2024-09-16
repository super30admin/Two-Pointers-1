# Time Complexity : O(N) where N is the input
# Sapce Complexity : O(1) 

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        if len(height) ==0:
            return 0
        s =0
        low =0
        high =len(height)-1
        while(low < high):
            area = min(height[low],height[high])*(high-low)
            s = max(area,s)
            if height[low] < height[high]:
                low+=1
            else:
                high-=1
        return s