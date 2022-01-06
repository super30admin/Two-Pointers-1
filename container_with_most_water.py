# Time Complexity - O(n)
# Space Complexity - O(1)

class Solution:
    
    def maxArea(self, height: List[int]) -> int:
        low = 0
        high = len(height)-1
        maxi = 0
        while low<high:
            w = abs(high-low)
            h = min(height[low],height[high])
            maxi = max(maxi,w*h)
            #print(maxi)
            if height[low]<height[high]:
                low = low+1
            else:
                high = high-1
        return maxi
