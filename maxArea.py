# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def maxArea(self, height: List[int]) -> int:
        i = 0
        j = len(height) - 1
        maxWater = 0
        while i < j:
            area = (j - i) * (min(height[i], height[j]))
            maxWater = max(maxWater, area)
            if height[i] < height[j]:
                i += 1
            else:
                j -= 1
        return maxWater
