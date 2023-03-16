# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        mid = 0
        high = len(nums) - 1
        while mid <= high:
            # print(low, mid, high)
            if nums[mid] == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
            elif nums[mid] == 2:
                nums[high], nums[mid] = nums[mid], nums[high]
                high -= 1
            else:
                mid += 1

            # print(nums)
        return nums