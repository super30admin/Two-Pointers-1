class Solution:
    def sortColors(self, nums):
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums: return []
        n = len(nums)
        l, mid, r = 0, 0, n-1
        while mid <= r:
            if nums[mid] == 2:
                nums[mid], nums[r] = nums[r], nums[mid]
                r -= 1
            elif nums[mid] == 0:
                nums[mid], nums[l] = nums[l], nums[mid]
                l += 1
                mid += 1
            else:
                mid += 1
        