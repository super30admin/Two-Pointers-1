# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        left = 0
        right = len(height) - 1
        maxarea = 0

        while left < right:
            length = right - left
            breadth = min(height[left], height[right])
            area = length * breadth

            if area > maxarea:
                maxarea = area
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        return maxarea
