# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this run on Leetcode: Yes
# Approach: Similar to 3 way partitioning routine for quicksort
# Use two pointers to keep track of the low and high boundaries. Set '1' to be the pivot element
# Iterate over the array, if the element is < pivot, swap the number with low pointer element - expand the low boundry outwards
# If the element is > pivot, swap it with the high pointer element, shrink the high boundry inwards
# Continue till the array is partitioned into low::pivot::high -- i crosses over high

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        i, low = 0, 0
        high = len(nums) - 1
        pivot = 1
        while i <= high:
            if nums[i] < pivot:
                nums[low], nums[i] = nums[i], nums[low]
                i += 1
                low += 1
            elif nums[i] > pivot:
                nums[i], nums[high] = nums[high], nums[i]
                high -= 1
            else: # nums[i] == pivot
                i += 1