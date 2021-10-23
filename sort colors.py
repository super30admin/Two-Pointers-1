# TC-O(n)
# SC-O(1)

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        left = 0
        current = 0
        right = len(nums) - 1
        while (current <= right):
            if nums[current] == 2:
                nums[current] = nums[right]
                nums[right] = 2
                right = right - 1
                print(nums)

            elif nums[current] == 0:
                nums[current] = nums[left]
                nums[left] = 0
                left = left + 1
                current += 1
                print(nums)

            else:
                current = current + 1

        return nums
