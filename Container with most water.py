#time complexity -0(n) and space complexity - o(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        result =0

        l= 0
        h=len(height)-1

        while l<h:
            area = min(height[l], height[h])* (h-l)
            result= max(result, area)

            if height[l]<=height[h]:
                l= l+1
            else:
                h= h-1
        return result