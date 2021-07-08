
#Time Complexity: O(N).
#Auxiliary Space: O(1)
#Did this code successfully run on leetcode :Yes

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        low =0
        ma =0
        high = len(height)-1
        while(low<high):
            area = (high-low)*min(height[low],height[high])
            if area>ma:
                ma=area
            if height[low]<=height[high]:
                low = low+1
                
            else:
                high = high-1
        return ma
                