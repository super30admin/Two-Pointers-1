# Did this code successfully run on Leetcode : YES

# Approach
# three pointers
# k should be for 2 so if mid (j) is 2, swap
# i should be for 0 so if mid (j) is 0, swap
# if mid (j) is 1, j += 1
# TC: O(n)
# SC: O(1)

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # 3 pointers
        # i red 0
        # j white 1
        # k blue 2
        i, j, k = 0, 0, len(nums)-1
        while j <= k:
            if nums[j] == 2:
                nums[j], nums[k] = nums[k], nums[j]
                k -= 1
            elif nums[j] == 0:
                nums[j], nums[i] = nums[i], nums[j]
                i += 1
                j += 1
            else:
                j += 1