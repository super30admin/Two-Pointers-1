
#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height == None or len(height)==0:
            return 0
        maxim = 0
        left = 0
        right = len(height)-1
        while left<right:
            maxim = max(maxim,min(height[left],height[right])*(right-left))
            
            if height[left]<height[right]:
                left+=1
                
            else:
                right-=1
                
        return maxim         