class Solution:
    def maxArea(self, height: List[int]) -> int:
        l=0
        h=len(height)-1
        max_area=float('inf')*-1
        while(l<h):
            area=min(height[l],height[h])*(h-l)
            if(area>max_area):
                max_area=area
            else:
                if(height[l]<height[h]):
                    l+=1
                else:
                    h-=1
        return max_area