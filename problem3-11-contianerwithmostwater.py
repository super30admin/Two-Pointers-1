#Time Complexity : 0(n)
#Space Complexity : o(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        i = 0
        j = len(height) - 1
        max_area = 0

        while i < j:
            max_area = max(max_area, (j - i) * min(height[i], height[j]))
            if height[i] < height[j]:
                i = i + 1
            elif height[j] < height[i]:
                j = j - 1
            else:
                i = i + 1

        return max_area