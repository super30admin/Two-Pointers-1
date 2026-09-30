# TIME COMPLEXITY: O(N) where N is the number of elements in the array, as the two pointers traverse the array at most once.
# SPACE COMPLEXITY: O(1) since we only use a few variables for pointers and tracking maximum area, performing all operations in-place.

class Solution:
    def maxArea(self, height: list[int]) -> int:
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