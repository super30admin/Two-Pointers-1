# Problem2 (https://leetcode.com/problems/3sum/)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        nums.sort()
        result = []
        for i in range(n-2):
            if nums[i] > 0:
                break
            if i != 0 and nums[i] == nums[i-1]:
                continue
            left = i + 1
            right = n - 1
            while left < right:
                currentSum = nums[i] + nums[left] + nums[right]
                if currentSum == 0:
                    result.append([nums[i], nums[left], nums[right]])
                    left += 1
                    right -= 1
                    while left < right and nums[left] == nums[left - 1]:
                        left += 1
                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1
                elif currentSum < 0:
                    left += 1
                else:
                    right -= 1
        return result
#Time complexity O(n^2)
#Space complexity O(1)
#use 2 pointers and 2Sum