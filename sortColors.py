# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # The below code was my first attempt, it runs perfectly on Leetcode and needs no extra space.
        # However, the new method uses 2-pointers and goes from O(2n) to O(n)
#         numsZero = numsOne = numsTwo = 0
#         for num in nums:
#             if num == 0:
#                 numsZero += 1
#             elif num == 1:
#                 numsOne += 1
#             else:
#                 numsTwo += 1
#         print("Nums 0:, ", numsZero)
#         print("Nums 1:, ", numsOne)
#         print("Nums 2:, ", numsTwo)
#         for i in range(0, len(nums)):
#             if numsZero > 0:
#                 nums[i] = 0
#                 numsZero -= 1
#             elif numsOne > 0:
#                 nums[i] = 1
#                 numsOne -= 1
#             else:
#                 nums[i] = 2
#                 numsTwo -= 1

        low = mid = 0
        high = len(nums)-1

        while mid <= high:
            if nums[mid] == 0:
                nums[mid], nums[low] = nums[low], nums[mid]
                mid += 1
                low += 1
            elif nums[mid] == 1:
                mid += 1
            else:
                nums[high], nums[mid] = nums[mid], nums[high]
                high -= 1
