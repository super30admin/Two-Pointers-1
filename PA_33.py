#LC 75 - Sort Colors
#Time Complexity - O(n)
#Space Complexity - O(1)
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        if not nums:
            return []
        
        low = 0
        mid = 0
        high = len(nums)-1
        
        while mid <= high:
            if nums[mid] == 1:
                mid = mid + 1
            elif nums[mid] == 2:
                temp = nums[high]
                nums[high] = nums[mid]
                nums[mid] = temp
                high = high - 1
            elif nums[mid] == 0:
                temp = nums[low]
                nums[low] = nums[mid]
                nums[mid] = temp
                low = low + 1
                mid = mid + 1
        #print(nums)