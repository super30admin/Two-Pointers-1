# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if len(height)==0:
            return 0
        maxh = 0
        left = 0
        right = len(height)-1
        
        while(left<right):
            maxh = max(maxh, (right-left)*min(height[left],height[right]))
            
            
            if height[left]<height[right]:
                left+=1
            else:
                right-=1
        
        return maxh
                
        