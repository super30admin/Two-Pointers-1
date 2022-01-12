#Time Complexity O(N)
#Space Complexity O(1) constant
class Solution:
    def maxArea(self, height: List[int]) -> int:
        curmax = 0
        low = 0
        high = len(height)-1
        
        while low<high:
            h = min(height[low],height[high])
            w = abs(high-low)
            area = h*w
            if area>curmax:
                curmax = area
            if height[low] <= height[high]:
                low+=1
            else:
                high-=1
        return curmax
            
                
        
