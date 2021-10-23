# 11. Container With Most Water
# https://leetcode.com/problems/container-with-most-water/

# Time complexiety: O(n)
# Space complexiety: O(1)

class Solution:
    def maxArea(self, height) -> int:
        maxArea = 0
        l, r = 0, len(height) - 1

        while l < r:
            currHeight = min(height[l],height[r])
            currArea = currHeight*(r-l)

            maxArea = max(maxArea,currArea)

            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
        return maxArea

obj = Solution()
print(obj.maxArea([1,8,6,2,5,4,8,3,7]))