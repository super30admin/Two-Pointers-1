class Solution:
    def maxArea(self, height: List[int]) -> int:
        left=0
        right=len(height)-1
        maxArea=float("-inf")
        while(left<right):
                width=right-left
                area=min(height[left],height[right])*width
                maxArea=max(area,maxArea)
                if(height[left]<height[right]):
                    left+=1
                else:
                    right-=1
               
        return maxArea

# Time Complexity: O(n)
# Space complexity: O(1)