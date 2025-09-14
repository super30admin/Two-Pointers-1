'''
Problem3 (https://leetcode.com/problems/container-with-most-water/)
'''

class Solution:
    def maxArea(self, height: List[int]) -> int: # type: ignore
        if height == None or len(height) == 0:
            return 0

        l = 0
        r = len(height) - 1
        res = 0

        while l < r:
            area = min(height[l], height[r]) * (r-l)
            res = max(area, res)

            if height[l] < height[r]:
                l = l+1
            else:
                r = r-1

        return res        
