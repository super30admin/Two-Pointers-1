# TC: O(n)
# SC: O(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        #We are just gonna use the basic formula for the rectangle which is a=w*l where w=r-l in our case
        res=0
        l,r=0,len(height)-1
        while l<r:
            area=(r-l)*min(height[l],height[r])
            res=max(res,area)
            
            if height[l]<height[r]:
                l+=1
            else:
                r-=1
        return res
        