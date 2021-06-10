class Solution:
    def sortColors(self, nums) -> None:
        """
        Time Complexity: O(n)
        Space Complexity: O(1)
        Do not return anything, modify nums in-place instead.
        """
        i, j, n = 0, 0, len(nums)-1

        while j <= n:
            if nums[j] == 0:
                nums[i], nums[j] = nums[j], nums[i]
                i += 1
                j += 1
            elif nums[j] == 2:
                nums[j], nums[n] = nums[n], nums[j]
                n -= 1
            else:
                j += 1