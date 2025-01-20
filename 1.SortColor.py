"""
Time Complexity: 0(n)
Space Complexity: 0(1)
Approach: 
    1. Dutch Flag Approach i.e. Three Ptrs
"""
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        ptr0 = 0
        ptr1 = 0
        ptr2 = len(nums) - 1


        # example: [2,0,1,0,2,1,2]

        while ptr1 <= ptr2:

            if nums[ptr1] == 0:
                # ptr0 is collection all the 0 values
                nums[ptr0], nums[ptr1] = nums[ptr1], nums[ptr0]
                # now this position is fixed with 0 value, move to another space
                ptr0 += 1
                # move ptr1 too -- this index comparion is complete
                ptr1 += 1
            
            elif nums[ptr1] == 1:
                # ptr1 is collection all the 1 values
                # its at correct place
                ptr1 += 1
            
            elif nums[ptr1] == 2:
                # ptr2 to collect all 2 values
                nums[ptr2], nums[ptr1] = nums[ptr1], nums[ptr2]
                # now this position is fixed with 2 value, move to another space
                ptr2 -= 1
        
        # end of while loop