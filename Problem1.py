# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#
class Solution:
    def sortColors(self, nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        mid = 0
        high = len(nums) - 1
        while mid <= high:
            if nums[mid] == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
            elif nums[mid] == 1:
                mid += 1
            elif nums[mid] == 2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
        return nums


check = Solution()
print(check.sortColors([2, 0, 2, 1, 1, 0]))


# class Solution:
#     def sortColors(self, nums: list[int]):
#         """
#         Do not return anything, modify nums in-place instead.
#         """
#         dictu = {0: 0, 1: 0, 2: 0}
#         for i in nums:
#             dictu[i] += 1
#
#         ptr = 0
#         while dictu[0] != 0:
#             nums[ptr] = 0
#             ptr += 1
#             dictu[0] -= 1
#         while dictu[1] != 0:
#             nums[ptr] = 1
#             ptr += 1
#             dictu[1] -= 1
#         while dictu[2] != 0:
#             nums[ptr] = 2
#             ptr += 1
#             dictu[2] -= 1
#         return nums
#
#
# check = Solution()
# print(check.sortColors([1, 1, 2, 2, 0, 1, 2, 0, 0]))
