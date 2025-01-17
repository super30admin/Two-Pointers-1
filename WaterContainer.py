# Time Complexity : O(n), no of elements in the given array
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA 

# Your code here along with comments explaining your approach:
# using two pointers - left and right, we have to return max possible area of the tank that can hold max water
# height of the tank will be minimum of height[left] and height[right] (because that a possible height)
# width of the tank will be right - left
# so we iterate the list with these 2 pointers and keep the track of max area in a variable
# but we want to maximise the area, so we have to move in the direction of the greater height
# based on this we move our left and right pointers


class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """

        maxArea = 0
        left = 0
        n = len(height)
        right = n - 1

        # left and height cannot be equal as well, because we need 2 sides as of the tank
        while(left < right):
            # area is height * width
            area = min(height[left], height[right]) * (right - left)
            # comparing if the new area is greater than previous max area
            maxArea = max(maxArea, area)
            # moving i the direction of the greater height
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        # returning max area
        return maxArea

        