# TC : O(n)
# SC : O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        h = len(height) - 1
        res = 0
        while l < h:
            # print(l, h)
            curr = min(height[l],height[h])*(h - l)
            res = max(res, curr)
            if height[l] < height[h]:
                l += 1
            else:
                h -= 1
        # print(res)
        return res
            # if height[l] < height[l+1]:
            #     l += 1
            # if height[h-1] > height[h]:
            #     h -= 1
                
        