"""
Name: Srinidhi Bhat
Space Complexity: O(1) - Only variables
Time Complexity: O(n) - Iterating through the array once

Did it run on LC: Yes

Logic: 
make 3 partitions - one for 0's,1's,2's. 
increase the pointers based on the situation - 1. when we get a 2 in place of 0
swap.
2. In case you get a 1 in place of 2, swap.
"""
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        red,white,blue = 0,0, len(nums)-1
        
        while white <=blue:
            if nums[white] == 0:
                nums[white],nums[red] = nums[red],nums[white]
                white+=1
                red+=1
                
            elif nums[white] ==1:
                white+=1
            
            else:
                nums[white],nums[blue] = nums[blue],nums[white]
                blue-=1
                
        return nums