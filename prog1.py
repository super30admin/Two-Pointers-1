class Solution(object):
    def sortColors(self, nums):
        high = len(nums) - 1
        low = 0
        mid = 0
        while(mid <= high):
            if nums[mid] == 2:
                nums[mid],nums[high] = nums[high],nums[mid]
                high = high - 1
                
            elif nums[mid] == 0:
                nums[mid],nums[low] = nums[low],nums[mid]
                low = low + 1
                mid = mid + 1
            else:
                if nums[mid] == 1:
                    mid = mid + 1
                
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
       #time = O(n)
       #space = O(1)