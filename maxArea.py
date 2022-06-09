# time:O(n), space:O(n)
class Solution:

    def maxArea(self, height: List[int]) -> int:
        # area= length*breadth, length=min(height(r), height(l), width= r-1)
        l, r = 0, len(height) - 1
        area = 0
        res = 0
        while l < r:
            area = (r - l) * (min(height[r], height[l]))
            res = max(res, area)
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
        return res

#         res=0
#         for i in range(len(height)):
#             for j in range(i+1,len(height)):

#                 currResult= ((j-i) * min(height[i],height[j]))
#                 if res< currResult:
#                     res= currResult

#         return res



