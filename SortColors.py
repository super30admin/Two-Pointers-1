# Approach: We have used 3 pointers. Low, mid and high. They point to first, current and last element. In other words they are responsible to make sure that 3 areas hold their designated values.


# We will encounter deal with 3 conditions in this:
# 1) nums[mid] == 0. It needs to be place in the first area.
# 2) nums[mid] == 1. It needs to be place in the second area.
# 3) nums[mid] == 2. It needs to be place in the third area.

# Time complexity: O(n)
# Space complexity: O(1)

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        if nums == None or len(nums) == 0:
            return
        
        n = len(nums)
        low = 0
        mid = 0
        high = n-1
        
        while mid <= high:
            
            # Condition 1: We will  increment both because after this array to the left will be sorted.               That means we do not need to worry about the array towards left. 
            if nums[mid] == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
                # Note: 
            
            # Condition 2: No swap is done because its at its rightful place 
            elif nums[mid] == 1:
                mid += 1
                
            
            # Condition 3: Only high will incremented because there is a chance that after swap number at             mid is 0, which will be an invalid place.
            else:
                nums[high], nums[mid] = nums[mid], nums[high]
                high -= 1
                
        return nums
    
         