# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :

class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxArea = 0
        n = len(height)
        l = 0
        h = n - 1
        while(l < h):
            currArea = min(height[l], height[h]) * (h-l)
            maxArea = max(maxArea, currArea)
            if height[h] > height[l]:
                l += 1
            else:
                h -= 1
        return maxArea