class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        r = len(height)-1
        maxWater = 0
        while l<r:
            cur = (r-l)*min(height[l],height[r])
            maxWater = max(maxWater, cur)
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
        
        return maxWater
    
# TC : O(n)
# SC : O(1)