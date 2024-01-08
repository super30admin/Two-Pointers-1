#Time Complexity: O(n)
#Space Complexity:O(1)
#Submit on leetcode: Yes

class Solution:
    def maxArea(self, height: list[int]) -> int:
        left = 0
        right = len(height) - 1
        max_con = 0

        while left < right:
            left_h = height[left]
            right_h = height[right]
            min_height = min(left_h, right_h)
            max_con = max(max_con, min_height * (right - left))

            if left_h < right_h:
                left += 1
            else:
                right -= 1

        return max_con

sol = Solution()
height = [1,8,6,2,5,4,8,3,7]
print(sol.maxArea(height))