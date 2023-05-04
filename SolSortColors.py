"""
TC = O(N) and SC = O(1) where N = number of elements in nums
"""

class Solution:
    def sortColors(self, nums: List[int]) -> None:
       low = 0
       mid = 0
       high = len(nums)-1
       while mid <= high:
            if nums[mid] == 0:
               nums[low], nums[mid] = nums[mid], nums[low]
               mid += 1
               low += 1
            elif nums[mid] == 2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
            else:
                mid += 1