# Time Complexity: O(1)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        ans = 0
        l = 0
        r = (len(height) - 1)
        while l < r:
            minHeight = min(height[l], height[r])
            ans = max(ans, (minHeight * (r - l)))
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
        return ans