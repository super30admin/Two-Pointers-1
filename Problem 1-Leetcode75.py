#Time complexity: O(n)
#Space complexity: O(1)

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        l, m, h = 0, 0, len(nums) - 1
        while m <= h:
            if nums[m] == 2:
                nums[m], nums[h] = nums[h], nums[m]
                h -= 1
            elif nums[m] == 0:
                nums[m], nums[l] = nums[l], nums[m]
                l += 1
                m += 1
            else: m += 1
        