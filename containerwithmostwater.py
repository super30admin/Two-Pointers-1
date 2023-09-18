class Solution:
    def maxArea(self, height) -> int:
        l = 0
        r = len(height)-1
        maxv = 0

        while l < r:
            multi_value = min(height[l],height[r])
            maxv = max(maxv, multi_value*(r-l))
            if height[l] <= height[r]:
                l += 1
            else:
                r -= 1
        return maxv
    
#TC : O(n)
#SC : O(1)