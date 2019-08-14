"""
time: O(n)
space: O(1)
Leet: Accept
Problems: Could not come up with approach, had to refer the solution given on Leet
"""


class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        first = 0
        last = len(height)-1
        water = 0
        while first<last:
            water = max(water,min(height[first],height[last])*(last-first))
            if height[last]<height[first]:
                last -= 1
            else:
                first += 1
        return water
