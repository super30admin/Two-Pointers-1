class Solution:
    def maxArea(self, height: List[int]) -> int:
        #tc==>O(n)
        # sc==>O(1)
        low=0
        ans=0
        high=len(height)-1
        while (low<high):
          # here we calculating the max area of min values that cover the most area 
            ans=max(ans,min(height[high], height[low])*(high-low))
            if height[low] < height[high]:
                low=low+1
            else:
                high=high-1
        return ans
        