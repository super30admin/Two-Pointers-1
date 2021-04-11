class Solution:
    def maxArea(self, height: List[int]) -> int:
        l=0
        h=len(height)-1
        max_area=0
        while(l!=h):
            if height[l]<height[h]:
                tot=height[l]*(h-l)
                max_area=max(max_area,tot)
                l+=1
            else:
                tot=height[h]*(h-l)
                max_area=max(max_area,tot)
                h-=1
        return max_area