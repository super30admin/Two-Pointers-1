# Time complexity : O(n)
# Space Complexity : O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_Area = 0
        l = 0
        r = len(height) - 1

        while(l < r):
            max_Area = max(max_Area, min(height[l],height[r])*(r - l))

            if height[r] > height[l]:
                l += 1
            else:
                r -= 1

        return max_Area
