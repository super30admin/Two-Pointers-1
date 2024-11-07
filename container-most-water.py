#Time Complexity : O(n)
#Space Complexity: O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        n = len(height)
        i = 0
        j = n-1
        maxWater = 0
        while i <=j:
            maxWater = max(maxWater, min(height[i], height[j])*(j-i))
            if height[i] < height[j]:
                i +=1
            else:
                j-=1
        return maxWater