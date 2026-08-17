# https://leetcode.com/problems/3sum/

# Time complexity: O(n^2) 
# Space complexity: O(n)
# Explanation: Take each number that is less than 0, and try to find subarrays whhere sum is 0;
# to find subarray assume the search space is for current index i to end of array

class Solution:
    def twoSum(self, nums: list[int], i: int, res: list[list[int]]):
        low, high = i + 1, len(nums) - 1
        while low < high:
            sum = nums[i] + nums[low] + nums[high]
            if sum < 0:
                low += 1
            elif sum > 0:
                high -= 1
            else:
                res.append([nums[i], nums[low], nums[high]])
                low += 1
                high -= 1
                while low < high and nums[low - 1] == nums[low]:
                    low += 1


    def threeSum(self, nums: list[int]) -> list[list[int]]:
        res = []
        nums.sort()
        for i in range(len(nums)):
            if nums[i] > 0:
                break
            if i == 0 or nums[i - 1] != nums[i]:
                self.twoSum(nums, i, res)
        return res
