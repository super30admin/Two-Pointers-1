# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES

# Any problem you faced while coding this : NO
class Solution:
    def maxArea(self, height: List[int]) -> int:
        l,r = 0,len(height) - 1
        res = 0
        
        while l < r:
            cur_area = (r-l) * min(height[l], height[r])
            res = max(res, cur_area)

            if height[l] > height[r]:
                r -= 1
            else:
                l += 1

        return res