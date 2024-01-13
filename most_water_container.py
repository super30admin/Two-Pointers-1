""" Explanation: In order to find the container with most water, we simply check which two elements in the array can give us max water. 
    To achieve that further, we use two pointers, left and right and check for which two elements, we can get the max water capacity, since
    we have already calculated width and max height of container.
    Time Complexcity: O(n)
    Space Complexcity: O(1)
"""


class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        left = 0
        right = len(height) - 1
        maxWater = 0

        while (left < right):

            # calculate the width
            width = right - left

            # calculate the height of the container
            h = min(height[left] , height[right])

            # water capacity of the current container to check
            water_capacity = width * h

            # update the max water, now that we have water capacity
            maxWater = max(maxWater, water_capacity)

            if(height[left] < height[right]):
                left += 1
            else:
                right -= 1
        
        return maxWater
