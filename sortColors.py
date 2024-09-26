#75. Sort Colors
#Time Complexity : O(n^2). 
# Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        temp = 0
        low = 0
        mid = 0
        high =  len(nums) - 1
        while mid <= high :
            if nums[mid] == 1:
                mid = mid + 1
            elif nums[mid] == 2:
                temp = nums[high]
                nums[high] = nums[mid]
                nums[mid] = temp
                high = high - 1
            else:
                temp = nums[low]
                nums[low] = nums[mid]
                nums[mid] = temp
                low = low + 1
                mid = mid + 1