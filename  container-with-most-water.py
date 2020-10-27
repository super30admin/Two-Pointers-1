class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        # Two pointers
        left = 0
        right = len(height) - 1
        max_area = -1
        min_height = sys.maxint
        
        # move towards the center
        while left<right:
            # The line with lower height determines the amount of water 
            # that can be stored
            min_height = min(height[left],height[right])
            
            # Area = length (min_height) * width (right - left)
            max_area = max(max_area, min_height*(right-left))
            
            # Try to maximize height on left or right
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return max_area
        