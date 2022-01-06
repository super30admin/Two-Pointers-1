'''
T.C: O(N)
S.C: O(1)

Intuition: using two points, left and right, we move inwards depending on the lowest height
- 
'''
class Solution:
    def maxArea(self, height: List[int]) -> int:
        hlen = len(height)
        if not hlen:
            return 0
        
        lp, rp = 0, hlen - 1
        maxm = 0
        
        while lp < rp:
            maxm = max(maxm, min(height[lp], height[rp]) * (rp - lp))
            if height[lp] < height[rp]:
                lp += 1
            else:
                rp -= 1
        
        return maxm
        