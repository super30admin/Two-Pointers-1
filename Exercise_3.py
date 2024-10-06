## Problem3 (https://leetcode.com/problems/container-with-most-water/)

# Time complexity - O(n)
# Space complexity - O(1)

from typing import List

class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height) - 1
        area = 0

        while left < right:
            dist = right - left
            h = min(height[left], height[right])
            area = max(area, dist * h)

            if height[left] <= height[right]:
                left += 1
            else:
                right -= 1

        return area

if __name__ == "__main__":
    solObj = Solution()
    height = [1,8,6,2,5,4,8,3,7]
    print(solObj.maxArea(height))
