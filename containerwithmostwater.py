class Solution:
    def maxArea(self, height: List[int]) -> int:
        l=0
        r=len(height)-1
        maxarea = 0
        while l<=r:
            currarea = min(height[l],height[r]) * (r-l)
            maxarea = max(maxarea,currarea)
            if height[l]<height[r]:
                l+=1
            else:
                r-=1
        return maxarea
        