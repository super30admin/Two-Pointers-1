''' Brute Force Approach
# Time complexity: O(n^2)
# Space Complexity: O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height == None or len(height)==0:
            return 0
        Max = 0
        for i in range (len(height)-1):
            for j in range(i+1, len(height)):
                Max = max(Max, min(height[i], height[j]) * (j-i))
        return Max
'''
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height == None or len(height)==0:
            return 0
        Max = 0
        low = 0
        high = len(height)-1
        while(low<high):
            Max = max(Max, min(height[low], height[high]) * (high-low))
            if height[high] >= height[low]:
                low += 1
            else:
                high -= 1
        return Max
