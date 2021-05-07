# TC: O(N) where N is the size of inout array. 
# SC: O(1)

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def swap(nums, a, b):
            nums[a], nums[b] = nums[b], nums[a]
        
        low = 0
        high = len(nums) - 1
        mid = 0
        
        while mid <= high:
            if nums[mid] == 0:
                swap(nums, mid, low)
                low += 1
                mid += 1
            elif nums[mid] == 2:
                swap(nums, mid, high)
                high -= 1
            else:
                mid += 1
