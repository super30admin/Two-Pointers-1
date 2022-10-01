'''
Time Complexity: O(n)
Space Complexity: O(1)
'''
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        low = 0
        high = len(height)-1
        area = float("-inf")
        while(low<high):
            temp_area = (high-low)*min(height[high], height[low])
            if(temp_area>area):
                area = temp_area
            if(height[high]>=height[low]):
                low +=1
            else:
                high -=1
        return area
            