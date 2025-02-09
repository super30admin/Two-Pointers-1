#Time complexityO(n)
# Space ComplexityO(1)
# able to run on leet code: Yes


class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        l=0
        r =  n-1
        maxx=0
        while(l<r):
            curr=min(height[l],height[r])*(r-l)
            maxx = max(curr,maxx)

            if (height[l]<height[r]):
                l+=1
            else:
                r-=1
        return maxx
        