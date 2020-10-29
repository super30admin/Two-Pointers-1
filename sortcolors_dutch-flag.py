class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        pointer = left = 0
        right = len(nums) - 1
        while pointer <= right:

            if nums[pointer] == 2:
                nums[pointer], nums[right] = nums[right], nums[pointer]
                right -= 1
            elif nums[pointer] == 0:
                nums[pointer], nums[left] = nums[left], nums[pointer]
                left += 1
                pointer += 1
            else:
                pointer += 1
        return nums

    #time-O(n)
    #space=O(1)