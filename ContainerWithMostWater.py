#T(N)=O(N)
#S(N)=O(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        left=0
        right=len(height)-1
        width=right-left
        res=0
        while(left<right):
            width=right-left
            if height[left]<=height[right]:
                temp=height[left]*width
                res=max(res,temp)
                left+=1
            else:
                temp=height[right]*width
                res=max(res,temp)
                right-=1
        return res
        