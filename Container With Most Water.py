# Time Complexity :  O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
    def maxArea(self, height: List[int]) -> int:
        p1 = 0
        p2 = len(height) - 1
        maxVolume = 0
        while(p1 < p2):
            curVolume = (p2 - p1) * min(height[p1],  height[p2])
            maxVolume = max(maxVolume, curVolume)
            if height[p1] < height[p2]:
                p1 += 1
            else:
                p2 -= 1
        return maxVolume
                        
