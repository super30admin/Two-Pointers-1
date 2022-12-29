"""
 FAANMG Problem #36 {Medium}


11. Container With Most Water

Time Complexity : O(N)



Space Complexity : O(1)


Did this code successfully run on Leetcode : Yes
  
We are using the two pointers to fing the max Area where 
Area = height * width

here we have to fing the min height of the two  and multiply the distance

The low pointer starts from the start and the high from the end


Current Area is found by
    currArea = (high - low) * min( height[low] , height[high] )
    
    and comparing it with the previous max value
    
    and decrementing the high or incrementing low if height[low] <= height[high]


@name: Rahul Govindkumar_RN27JUL2022
"""


class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        
        n = len(height)
        
        low = 0
        high = n-1
        maxArea =0
        
        while(low < high ):
            
            currArea = (high - low) * min( height[low] , height[high] )
            
            maxArea = max(maxArea, currArea)
            
            if( height[low] <= height[high]):
                low +=1
                
            else:
                high -=1
                
        return maxArea
            
            