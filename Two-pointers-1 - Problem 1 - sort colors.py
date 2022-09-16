"""
 FAANMG Problem #34 {Medium}

75. Sort Colors

Time Complexity : O(N)

Space Complexity : O(1)


Did this code successfully run on Leetcode : Yes
  

We are using 3 pointers
  
    low=0
    mid =0
    high = last elemnt
    
    loop until mid and high crosses
    
    While iterating mid:
        if mid == 2, then we swap mid and high values and decrementing high pointer
        if mid == 0, then we swap mid and low and then increment both pointer
        
        else if mid == 1 the increment mid pointer

@name: Rahul Govindkumar_RN27JUL2022
"""

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        if(len(nums) ==0):
            return
        
        low = 0
        mid = 0
        high = len(nums) -1
        
        while(mid<= high):
            
            if(nums[mid]==2):
                nums[mid], nums[high] = nums[high], nums[mid]
                high -=1
            
            elif(nums[mid] == 0):
                nums[mid], nums[low] = nums[low], nums[mid]
                low += 1
                mid +=1
            else:
                mid +=1

        