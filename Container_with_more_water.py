class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_area = 0
        l = 0
        r = len(height)-1
        while(l < r):
            temp = (r-l)* min(height[r] ,height[l])
            max_area = temp if temp > max_area else max_area
            if height[l] <= height[r]:
                l += 1
            else:
                r -= 1
        return max_area