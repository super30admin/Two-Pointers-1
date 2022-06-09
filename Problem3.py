# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#

class Solution:
    def maxArea(self, height: list[int]) -> int:
        start = 0
        end = len(height)-1
        maxi = 0
        while start <= end:
            if height[start] <= height[end]:
                maxi = max(maxi, height[start] * abs(start - end))
                start += 1
            else:
                maxi = max(maxi, height[end] * abs(start - end))
                end -= 1
        return maxi


check = Solution()
print(check.maxArea([1, 8, 6, 2, 5, 4, 8, 3, 7]))