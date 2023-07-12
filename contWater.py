#TC:O(N)
#SC:O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        res = 0 
        l = 0 
        r = len(height)-1
        while l<r:
            a=min(height[l],height[r])
            area=((r-l)*a)
            res=max(area,res)
            res = max(res,area)
            if height[l] < height[r]:
                l+=1
            else:
                r-=1
        return res

        