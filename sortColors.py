# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

# // Your code here along with comments explaining your approach
# DONE BEFORE CLASS using counting sort logic

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

# Approach#2: AFTER CLASS, using single pass
# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

# // Your code here along with comments explaining your approach


class Solution:
    
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums or len(nums)==0:
            return
        
        # initiating the pointers:
        # left @ last zero+1, right @ first 2 -1
        # current
        left = 0
        current = 0
        right = len(nums)-1
        
        #till current pointer moves ahead of right pointer, 
        #if you encounter 0, swap left and current elements such that your left @ last zero+1
        #increase left and current pointers since you encountered 0
        #if you encounter 1, move the current counter ahead
        #if you encounter 2, swap current and right elements as 2 needs to be at the end of the array
        #decrease right pointer position by 1 to maintain right @ first 2 -1
        while current <= right:
            if nums[current] ==0:
                self.swap(nums, current, left)
                left +=1
                current+=1
            elif nums[current]== 1:
                current +=1
            else:
                self.swap(nums, current, right)
                right -=1
        
    #function to swap elements
    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
                
            
            
        
            
            
        