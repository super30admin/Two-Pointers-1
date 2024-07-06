class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxArea=0
        l=0
        r=len(height)-1
        while l<r:
            area= min(height[r],height[l]) * (r-l)
            maxArea= max(maxArea, area)
            if height[r]<=height[l]:
                r-=1
            else:
                l+=1
        return maxArea