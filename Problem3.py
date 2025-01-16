class Solution:
    def maxArea(self, height: List[int]) -> int:
        res = 0
        l, r = 0, len(height) - 1

        while l < r:
            a = (r - l) * min(height[r], height[l])
            res = max(res, a)

            if height[l] > height[r]:
                r -= 1
            else:
                l += 1
        return res
        # T: O(n), S: O(1)