class Solution:
    def sortColors(self, nums):
        low, high, mid = 0, len(nums)-1, 0

        while mid <= high:
            if nums[mid] == 2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
            elif nums[mid] == 0:
                nums[mid], nums[low] = nums[low], nums[mid]
                low += 1
                mid += 1
            else:
                mid += 1

#Time: O(n)
#Space: O(1)