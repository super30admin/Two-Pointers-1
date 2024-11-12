# Approach:
# We use the Dutch National Flag algorithm to sort the array in a single pass.
# We maintain three pointers: `low` for the next position of 0, `mid` for the current element, and `high` for the next position of 2.
# By moving `mid` through the array and swapping elements as needed, we ensure all 0's are at the beginning, 1's in the middle, and 2's at the end.

# Time Complexity: O(n), where n is the number of elements in nums
# Space Complexity: O(1), as we are sorting in-place without extra space
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low, mid, high = 0, 0, len(nums) - 1
        
        while mid <= high:
            if nums[mid] == 0:
                # Swap nums[low] and nums[mid], increment both pointers
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
            elif nums[mid] == 1:
                # Move mid pointer to the right
                mid += 1
            else:
                # Swap nums[mid] and nums[high], decrement high pointer
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
