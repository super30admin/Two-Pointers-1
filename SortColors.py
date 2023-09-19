class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        left = 0
        mid = 0
        right = len(nums) - 1
        while(mid <= right):
            if(nums[mid] == 2):
                self.swap(nums, mid, right)
                right -= 1
            elif(nums[mid] == 0):
                self.swap(nums, mid, left)
                left += 1
                mid += 1
            else:
                mid += 1

    def swap(self, nums, origin, dest):
        temp = nums[origin]
        nums[origin] = nums[dest]
        nums[dest] = temp