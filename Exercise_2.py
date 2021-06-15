class Solution:
    def maxArea(self, height: List[int]) -> int:
        res=0
        l=len(height)
        i,j=0,l-1
        while i<j:
            k=(j-i)*min(height[j],height[i])
            if k>res:res=k
            if height[j]<height[i]:j-=1
            else:i+=1
        return (res)