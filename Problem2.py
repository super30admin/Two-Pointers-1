'''
Time Complexity: O(n * n)
Space COmplexity: O(1)
Run on Leetcode: YES
'''
class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        # null
        if len(nums) == 0:
            return []
        nums.sort()
        n = len(nums)
        result = []
        for index in range(n):
            if nums[index] > 0:
                break
            if index != 0 and nums[index - 1] == nums[index]:
                continue
            low = index + 1
            high = n - 1
            while low < high:
                if nums[low] + nums[high] == nums[index] * -1:
                    result.append([nums[index], nums[low], nums[high]])
                    while low < high and nums[low] == nums[low + 1]:
                        low += 1
                    while low < high and nums[high] == nums[high - 1]:
                        high -= 1
                    low += 1
                    high -= 1
                elif nums[low] + nums[high] > nums[index] * -1:
                    high -= 1
                else:
                    low += 1
        return result