# Time Complexity =   Space Complexity = O(1)

class Solution:
    def maxArea(self, height: list[int]) -> int:
        max_n = 0
        j = len(height) - 1
        i = 0

        while i < j:
            if height[i] < height[j]:
                a = height[i] * (j - i)
                i += 1
            else:
                a = height[j] * (j - i)
                j -= 1
            max_n = max(a, max_n)
        return max_n


