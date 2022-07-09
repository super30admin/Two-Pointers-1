#Time Complexdity: O(n)
#Space Complexity: O(1)

class Solution:
    def maxArea(self, height) -> int:
        def amountWater(i, j):
            return min(height[i], height[j]) * (j - i)

        maxWater = 0
        i, j = 0, len(height) - 1
        while i < j:
            if maxWater < amountWater(i, j):
                maxWater = amountWater(i, j)
            if height[i] < height[j]:
                i += 1
            else:
                j -= 1
        return maxWater