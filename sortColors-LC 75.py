# Time Complexity = O(n)
# Space Complexity = O(1)

class Solution:
    def sortColors(self, nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums == None or len(nums) == 0:
            return
        
        n = len(nums)
        # Initialising the 3 pointers for keeping track of the 3 colors
        low = 0             # For Red(or 0)
        mid = 0             # For White(or 1)
        high = n - 1        # For Blue(or 2)
        
        
        while (mid <= high):
            
            # Swap with low, to bring 0's to the front of array
            if nums[mid] == 0:
                nums[mid], nums[low] = nums[low], nums[mid]
                low += 1
                mid += 1
            
            # No swapping needed as mid points and tracks/maps to elements that equate to 1
            elif nums[mid] == 1:
                mid += 1
            
            # Swap with high, to take 2's to the end of the array
            else:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
        
        
        