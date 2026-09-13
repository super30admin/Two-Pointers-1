# https://leetcode.com/problems/container-with-most-water/

# TC: O(n)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        maxim = 0

        l, r = 0, n-1

        while l < r:
            w = r - l
            effHeight = 0

            if height[l] < height[r]:
                effHeight = height[l]
                l +=1
            else:
                effHeight = height[r]
                r -=1
            
            maxim = max(maxim, effHeight * w)

        return maxim