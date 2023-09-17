class Solution:
    def maxArea(self, height):
        maxarea = 0
        l,r= 0,len(height)-1
        while l < r:
            maxarea = max(maxarea, min(height[r],height[l])*(r-l))
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1