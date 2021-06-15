# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

class Solution:
    def maxArea(self, height: List[int]) -> int:

        # Calculate the length
        arr_size = len(height)
        left, right = 0, arr_size - 1
        max_arr = 0

        while left < right:  # left should never cross right
            # calculate area of present container and stare if max than previous one
            max_arr = max(max_arr, min(height[left], height[right]) * (right - left))
            if height[left] < height[right]:
                left = left + 1
            elif height[left] > height[right]:
                right = right - 1
            elif height[left] == height[right]:
                left = left + 1
                right = right - 1
        return max_arr
