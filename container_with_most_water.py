# Time Complexity : O(n)
# Space complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# start with two pointers at extreme ends of the array because the widest possible container is the starting point for the maximum area.
# calculates the current area based on the shorter of the two lengths and maintain max area.
# Move the poiinter that has the shorter height inward to maximize the area of container.


class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        #Method 2: efficient 2 pointer
        result = 0
        l, r = 0, len(height)-1
        while l < r:
            height_of_rect = min(height[l], height[r])
            area = (r - l) * height_of_rect
            result = max(area, result)

            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
        return result