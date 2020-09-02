# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
# DONE BEFORE CLASS using counting sort

class Solution:
    
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        #initialise the count of objects of different colors to zero
        
        red, white, blue = 0,0,0
        
        #count the number of times each color appears
        for i in range(len(nums)):
            if nums[i] == 0:
                red +=1
            elif nums[i] == 1:
                white +=1
            else:
                blue +=1
        
        #insert the value of the color #of times it appears in the array 
        #indicated by the count taken in previous pass.
        
        for i in range(len(nums)):
            if i<red:
                nums[i] = 0
            elif i>=red and i<red+white:
                nums[i] = 1
            else:
                nums[i] = 2
                
            
            
        