class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxi=0
        n= len(height)
        low=0
        high= n-1
        while(low<high):
            curArea=0
            if height[low]< height[high]:
                curArea= (high-low)*height[low]
                low+=1
            else:
                curArea= (high-low)*height[high]
                high= high-1
            maxi= max(maxi, curArea)
        return maxi
        