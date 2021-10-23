# TC-O(n)
# SC-O(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if len(height)<2:
            return 0
        l=0
        r=len(height)-1
        res=0
        while l<r:
            area=(r-l)*(min(height[l],height[r]))
            res=max(res,area)
            if height[l]<height[r]:
                l=l+1
            else:
                r=r-1
        return res