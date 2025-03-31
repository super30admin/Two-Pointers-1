# Dutch National Flag algorithm to sort colors (0, 1, 2) in-place or three pointers
# TC: O(n) - Single pass through the list
# SC: O(1) - In-place sorting

from typing import List


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        # Edge case: empty list
        if not nums:
            return

        low, mid = 0, 0
        high = len(nums) - 1

        # Process elements until mid crosses high
        while mid <= high:
            if nums[mid] == 0:  # Swap to place 0s at the beginning
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
            elif nums[mid] == 1:  # Skip 1s as they are already in the middle
                mid += 1
            else:  # Swap to place 2s at the end
                nums[high], nums[mid] = nums[mid], nums[high]
                high -= 1

        # Print the sorted list
        print(nums)


# Example usage
sol = Solution()
nums = [2, 0, 2, 1, 1, 0]
sol.sortColors(nums)
