class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        
        l = 0
        m = 0
        h = len(nums) - 1
        
        while m <= h:
            if nums[m] == 2:
                nums[m], nums[h] = nums[h], nums[m]
                h -= 1
            elif nums[m] == 1:
                m += 1
            elif nums[m] == 0:
                nums[m], nums[l] = nums[l], nums[m]
                l += 1
                m += 1
        
        
# 3 pointers for keeping count of three variables in the array. iterating mid and comparing with the values at low and high
# TC: O(N) SC: O(1) 