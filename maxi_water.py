class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxi = 0

        l = 0
        h = len(height) - 1
        while (l < h):
            maxi = max(maxi, min(height[l], height[h]) * (h - l))
            if (height[l] <= height[h]):
                l += 1
            else:
                h -= 1
        return maxi


height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
obj = Solution()
print(obj.maxArea(height))
