# Container with Most Water
# Using the Two Pointers Technique
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        res = 0
        l,h = 0,len(height)-1
        while l<h:
            w = h-l
            if height[l]<height[h]:
                min_h = height[l]
                l+=1    
            else:
                min_h = height[h]
                h-=1
            res = max(res,min_h*w)
        return res


        