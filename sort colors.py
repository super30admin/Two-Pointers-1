# TC: O(n)
# SC: O(1)
# The code compiled successfully on LC

class Solution:
    
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        low = 0
        mid = 0
        high = n-1

        while mid <= high:
            if nums[mid] == 1:
                mid += 1
            elif nums[mid] == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
            elif nums[mid] == 2:
                nums[high], nums[mid] = nums[mid], nums[high]
                high -= 1
        
