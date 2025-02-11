#Sort Colors
# Time Complexity: O(n)
#Space Complexity: O(1)

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = curr = 0

        high = len(nums) - 1

        while curr <= high:
            if nums[curr] == 0:
                nums[low], nums[curr] = nums[curr], nums[low]
                low += 1
                curr += 1
            elif nums[curr] == 2:
                nums[curr], nums[high] = nums[high], nums[curr]
                high -= 1
            else:
                curr += 1