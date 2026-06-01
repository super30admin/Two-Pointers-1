class Solution:
    def maxArea(self, height):
        n = len(height)

        low, high = 0, n - 1
        area = 0

        while low < high:
            h = 0
            w = high - low

            if height[low] < height[high]:
                h = height[low]
                low += 1
            else:
                h = height[high]
                high -= 1

            area = max(area, h * w)

        return area

# Time: O(n)
# Space: O(1)