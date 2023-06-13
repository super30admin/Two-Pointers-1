class Solution(object):
    def sortColors(self, nums):
        """
        Time complexity: O(n)
        Space complexity: O(1)
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        if nums is None or len(nums) == 0:
            return

        n = len(nums)
        low, mid, high = 0, 0, n - 1

        while mid <= high:
            if nums[mid] == 2:
                # Swap nums[mid] with nums[high] and move high pointer left
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
            elif nums[mid] == 0:
                # Swap nums[mid] with nums[low] and move both low and mid pointers right
                nums[mid], nums[low] = nums[low], nums[mid]
                mid += 1
                low += 1
            else:
                # Move mid pointer right
                mid += 1
