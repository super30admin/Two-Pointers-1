"""
// Time Complexity : O( N)  N number of elements
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

"""


class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxval = 0
        l = 0
        h = len(height) - 1
        while l < h:
            area = min(height[l], height[h]) * (h - l)
            if area > maxval:
                maxval = area
            if height[l] < height[h]:

                l += 1
            else:
                h -= 1
        return maxval