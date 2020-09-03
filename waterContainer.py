# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
# Before class:
# Maintain a maxm so far variable and update it only if the area increases

class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        max_so_far = 0
        
        left = 0
        right = len(height)-1

        while left<right:
           
            area = min(height[left], height[right])*(right-left)
            
            if area >= max_so_far:
                max_so_far = area
            
            if height[left] < height[right]:
                left +=1
            else:
                right-=1
            
            
        return max_so_far
            