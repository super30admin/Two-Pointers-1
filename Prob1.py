class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        #O(n)
        l,m = 0,0
        h = len(nums) - 1
        def swap(x,y):
            temp = x
            x = y
            y = temp
        while m <= h:
            if nums[m] == 2:
                nums[m],nums[h] = nums[h],nums[m]
                h -= 1
            elif nums[m] == 0:
                nums[m],nums[l] = nums[l],nums[m]
                l += 1
                m += 1
            else:
                m += 1
        return nums
