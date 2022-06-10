""""// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
"""

class Solution:
    def maxArea(self, height):
        m = 0
        i = 0
        j = len(height) - 1
        start = 0
        end = 0

        while (i < j):
            curr_m = min(height[i], height[j]) * (j - i)

            if curr_m > m:
                start = i
                end = j
                m = curr_m

            if (height[i] < height[j]):
                i += 1
            else:
                j -= 1

        print("start index :", start)
        print("end index :", end)

        return m


# class Solution:
#     def maxArea(self, height: List[int]) -> int:
#         i = 0
#         j = len(height) - 1
#         m = 0
#
#         while (i < j):
#             if height[i] > height[j]:
#                 m = max(m, height[j] * (j - i))
#                 j -= 1
#             else:
#                 m = max(m, height[i] * (j - i))
#                 i += 1
#         return m

