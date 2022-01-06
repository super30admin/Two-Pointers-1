"""

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, 
with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

"""

# Time Complexity : O(n)
# Space Complexity :  O(1) in place
# Did this code successfully run on VSCode :
# Any problem you faced while coding this : 

from typing import List

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        # Using right pointer that starts from first element of nums and right pointer to start from the end of the listt
        # as long as we move all 2's to the right and all 0's to the left, only thing left in the middle are 1's
    
        n0 = 0
        n2 = len(nums) -1
        i = 0

        while i <= n2:
            if nums[i] == 0:
                nums[n0], nums[i] = nums[i], nums[n0]
                i += 1
                n0 += 1
            
            elif nums[i] == 2:
                nums[i], nums[n2] = nums[n2], nums[i]
                n2 -= 1
                
            elif nums[i] == 1:
                i += 1
 
            #return nums
                
                
                
                
                
                
        



            