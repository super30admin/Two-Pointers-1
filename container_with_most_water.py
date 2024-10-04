"""
for each of the height, check what is the max water that can be stored using that height. that is for the given height:
check if it is the minimum or there a height greater than it if yes, check what is the max height greater
than it. TC: O(n^2)
Approach 2 optimal: 2 pointers, where should we place those? 0 and last idx why? because we want to maximize the area
so we start with max width. By selecting the minimum between the lo and hi pointer, we make sure; it is the max area that
can be formed with the minimum pointer. So we can move a minimum pointer ahead.
TC: O(n)
"""
from typing import List


class Solution:
    def maxArea_approach2(self, height: List[int]) -> int:
        lo, hi = 0, len(height) - 1
        max_a = 0
        while lo <= hi:
            if height[lo] <= height[hi]:
                area = (hi-lo) * height[lo]
                max_a = max(max_a, area)
                lo += 1
            else:
                area = (hi - lo) * height[hi]
                max_a = max(max_a, area)
                hi -= 1

        return max_a

    def maxArea_approach1(self, height: List[int]) -> int:

        max_a = float("-inf")
        for i in range(len(height)):
            breadth = 0  # 0
            for j in range(i + 1, len(height)):
                if height[i] >= height[j]:
                    area = height[j] * (j - i)  # 8 * 1
                    max_a = max(max_a, area)  # 8


                elif height[i] < height[j]:
                    area = height[i] * (j - i)  # 8 * 1
                    max_a = max(max_a, area)  # 8

        return max_a
