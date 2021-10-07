# Time complexity: O(n)
# Space complexity: O(1)

class Solution:
    def maxArea(self, height):
        water = 0
        left, right = 0, len(height)-1
        lw, rw = height[left], height[right]

        while left < right:
            water = max((right-left)*min(height[left], height[right]), water)

            if height[left] < height[right]:
                lw = max(lw, height[left])
                left += 1

            else:
                rw = max(rw, height[right])
                right -= 1
        return water


solution = Solution()
print(solution.maxArea([[1, 8, 6, 2, 5, 4, 8, 3, 7]]))
