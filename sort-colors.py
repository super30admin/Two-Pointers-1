# Time complexity: O(n)
# Space complexity: O(1)

# The code successfully ran on leetcode

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums) == 0 or nums == None:
            return
        
        low = 0
        high = len(nums) - 1
        mid = 0
        
        while mid <= high:
            if nums[mid] == 2:
                nums[high], nums[mid] = nums[mid], nums[high]
                high -= 1
                
            elif nums[mid] == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
            
            else:
                mid += 1
                
        