# Outer loop and 2 pointer approach where we check while left < right sum of three elements is zero. if greater decrement right, if less increment left and if equal append and do both.
# TC: O(n^2)
# SC: O(1)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if len(nums) < 3:
            return []
        res = []
        nums = sorted(nums)
        for i in range(len(nums)):
            if (i != 0 and nums[i] == nums[i-1]):
                continue
            if (nums[i] > 0):
                break
            left = i + 1
            right = len(nums) - 1
            while (left < right):
                if nums[i] + nums[left] + nums[right] == 0:
                    res.append([nums[i], nums[left], nums[right]])
                    left += 1
                    right -= 1
                    while left < right and nums[left] == nums[left - 1]:
                        left += 1
                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1
                elif nums[i] + nums[left] + nums[right] < 0:
                    left += 1
                else:
                    right -= 1
        return res
