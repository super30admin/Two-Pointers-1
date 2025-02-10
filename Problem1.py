# 75. Sort Colors

# Time Complexity: O(n)
# Space Complexity: O(1)

# Approach:
# Use three pointers to sort the array.
# One pointer for the current element, one for the next position of 0, and one for the next position of 2.
# Iterate through the array and swap elements to ensure all 0s are at the beginning, 1s in the middle, and 2s at the end.

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        zero_index, current, two_index = 0, 0, len(nums) - 1
        
        while current <= two_index:
            if nums[current] == 0:
                nums[zero_index], nums[current] = nums[current], nums[zero_index]
                zero_index += 1
                current += 1
            elif nums[current] == 2:
                nums[current], nums[two_index] = nums[two_index], nums[current]
                two_index -= 1
            else:
                current += 1