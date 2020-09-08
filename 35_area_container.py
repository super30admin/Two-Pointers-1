# S30 Big N Problem #35 {Medium}

# Container With Most Water

# Time Complexity : O(n) n= no. of heights in the array
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 

# Approach 
# Maintain 2 pointers at start and end of array. 
# Calculate area using the heights and width. 
# Move the pointer whose height is same and recalculate the area. 
# Iterate till start<end. 

class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        area=0
        
        start=0
        end=len(height)-1
        
        while start<end:
            
            temp=min(height[start],height[end])*(end-start)
            
            area=max(area,temp)
            
            if height[start]<height[end]:
                start+=1
            else:
                end-=1
        
        return area
        