#TC: O(n)
#SC: O(1)
class Solution(object):
    def maxArea(self, height):
        maxArea = 0
        if (height == None or len(height) == 0):
            return maxArea

        low = 0
        high = len(height) - 1

        while (low < high):
            currentArea = min(height[low], height[high]) * (high - low)   
            maxArea = max(maxArea, currentArea)       
            if (height[low] < height[high]):     
                low += 1
            else:
                high -= 1

        return maxArea
