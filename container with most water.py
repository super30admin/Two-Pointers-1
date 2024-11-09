# TC: O(n)
# SC: O(1)
# This code compiled on LC successfully

class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height) - 1
        vol = 0

        while left < right:
            w = right - left
            h = min(height[right], height[left])
            vol = max(vol, w*h)
            if h == height[right]:
                right -= 1
            else:
                left += 1
        return vol
