# Time Complexity : O(n)
# Space Complexity : O(1)

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        res = 0
        left = 0
        right = len(height)-1

        while (left<right):
            width = right - left

            if height[left] <= height[right]:
                area = height[left] * width
                left += 1

            else:
                area = height[right] * width
                right -= 1
            res = max(res,area)

        return res
