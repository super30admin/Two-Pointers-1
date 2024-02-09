# Time complexity is  O(n) n is the length of the array
# Space complexity is (1) we do not use any memory for computation
class Solution:
    def maxArea(self, height: list[int]) -> int:
        firstPtr = 0
        lastPtr = len(height) - 1
        area = 0
        while firstPtr < lastPtr:
            area = max(area, min(height[firstPtr],
                       height[lastPtr]) * (lastPtr - firstPtr))

            if height[firstPtr] < height[lastPtr]:
                firstPtr += 1
            else:
                lastPtr -= 1

        return area
