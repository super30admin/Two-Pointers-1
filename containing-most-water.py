# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        h = height
        n = len(h)

        l = 0  # left pointer
        r = n - 1  # right pointer

        max_area = 0  # to store the maximum area captured

        while l < r:

            area = min(h[l], h[r]) * (r - l)  # calculating the area

            max_area = max(max_area, area)  # taking max current area

            if h[l] <= h[r]:
                l = l + 1
            else:
                r = r - 1

        return max_area
