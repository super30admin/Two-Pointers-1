#Time Complexity: O(N)
#Space Complexity: O(1)

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        left = 0
        max_area = 0
        right = len(height) - 1
        while left < right:
            
            if height[left] > height[right]:
                area = (right - left) * (height[right])
                max_area = max(max_area,area)
                right -= 1
            else:
                area = (right - left) * (height[left])
                max_area = max(max_area,area)
                left += 1
        return max_area



        
        