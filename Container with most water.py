#TC:O(n)
#SC:O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        r = len(height) - 1
        max_area = 0
        while l < r:
            width = r - l
            high = min(height[l], height[r])
            area = width * high
            max_area = max(max_area, area)
            if height[l] > height[r]:
                r -= 1
            else:
                l += 1
        return max_area
            