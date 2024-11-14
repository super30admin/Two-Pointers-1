class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        r = len(height)-1
        vol = min(height[l],height[r]) * (r-l)
        maxvol = vol

        while (l<r):
            vol = min(height[l],height[r]) * (r-l)
            maxvol = max(maxvol,vol)
            if (height[l]<=height[r]):
                l = l + 1
            else:
                r = r - 1
        return maxvol
        