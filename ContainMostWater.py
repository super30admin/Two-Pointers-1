class Solution:
    def maxArea(self, h: List[int]) -> int:
        maxArea = 0
        l = 0
        r = len(h)-1

        while l < r:
            maxArea = max(maxArea, min(h[l], h[r]) * (r - l))
            if h[l] > h[r]:
                r -= 1
            else:
                l += 1
        
        return maxArea


