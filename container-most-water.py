# O(n) time, O(1) space

# move pointers inward when height is lower 
class Solution:
    def maxArea(self, height: List[int]) -> int:
        l=0
        r=len(height)-1
        area = 0
        while l < r:
            width = r - l
            if height[l]<=height[r]:
                area = max(area,height[l]*width)
                l+=1
            elif height[l]>height[r]:
                area = max(area,height[r]*width)
                r-=1
        return area