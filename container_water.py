class Solution:
    def maxArea(self, height: List[int]) -> int:
        res = 0
        l = 0
        r = len(height) - 1

        while l < r:
            area = min(height[l], height[r]) * (r-l)
            res = max(res, area)

            if height[l] < height[r]:
                l = l+1
            else:
                r = r-1

        return res
#time - o(n)
#space - o(1)