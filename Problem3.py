# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no
# Problem Name: Container With Most Water

class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        low = 0
        high = n - 1
        maxWater = 0
        while low <= high:
            h = 0
            w = high - low
            if height[low] < height[high]:
                h = height[low]
                low += 1
            else:
                h = height[high]
                high -= 1

            maxWater = max(maxWater, h * w)

        return maxWater