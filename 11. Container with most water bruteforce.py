#bruteforce solution
#Time Complexity : O(N^2)
#Space compleity : O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        vol = 0
        for i in range(len(height)):
            for j in range(i,len(height)):
                h = min(height[i],height[j])
                vol = max(vol,h*(j-i))
        return vol