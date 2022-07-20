#TC => o(n)
#SC => o(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        area = float('-inf')
        i=0
        j=len(height)-1
        while(i<j):
            x=min(height[i],height[j])
            ar = x*(j-i)
            area = max(ar,area)
            if height[i]<height[j]:
                i+=1
            elif height[i]>height[j]:
                j-=1
            else:
                i+=1
                j-=1
        return area