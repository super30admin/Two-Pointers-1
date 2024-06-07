# Time O(N)
# Space O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        if not height:
            return 0
        left, right = 0, len(height) - 1
        max_v = 0
        while left < right:
            max_v = max(max_v, min(height[right], height[left]) * (right - left))
            if height[right] > height[left]:
                left += 1
            else:
                right -= 1
        return max_v

        