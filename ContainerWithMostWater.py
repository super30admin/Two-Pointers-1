# Time Complexity : O(N)  //Where n is the size of the array
#  Space Complexity : O(1)  //We are not using any extra array
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : N/A

#  Your code here along with comments explaining your approach

class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        
        #Base case if the height is null  
        if not height:
            return 0
        
        #Declare our two pointer left and right
        l = 0
        r = n-1
        maxA = 0

        #Iterate till both the left and right are at same index
        while l <= r:
            #Calculating the max area and updating it each iteration to take the max area
            area = min(height[l],height[r]) * (r - l)
            maxA = max(maxA, area)
            
            #Move the pointers accordingly
            if height[l] < height[r]:
                l+=1
            else:
                r-=1                
        return maxA