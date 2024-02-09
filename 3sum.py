"""
Time Complexity : O(n^2)
Space Complexity : O(1)
Did this code successfully run on Leetcode :  yes 
Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
"""


class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        target = 0
        result = []
        n = len(nums)
        nums.sort()
        for i in range(n):
            if i != 0 and nums[i] == nums[i - 1]:
                continue
            if nums[i] > target:
                break
            low = i + 1
            high = n - 1
            while low < high:
                sum = nums[i] + nums[low] + nums[high]
                if sum == target:
                    temp = [nums[i], nums[low], nums[high]]
                    result.append(temp)
                    low += 1
                    high -= 1
                    while low < high and nums[low] == nums[low - 1]:
                        low += 1
                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1
                elif sum > target:
                    high -= 1
                else:
                    low += 1
        return result
