# Time Complexity = O(n)
# Space Complexity = O(1)
from typing import List


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if len(nums) == 0 or nums == None:
            return []
        result = []
        nums.sort()

        for i in range(len(nums)):
            if i != 0 and nums[i] == nums[i -1]:
                continue
            left = i+1
            right = len(nums) -1

            if nums[i] > 0:
                break

            while left < right:
                sumA = nums[i] + nums[left] + nums[right]
                if sumA == 0:
                    result.append([nums[i],nums[left],nums[right]])
                    left = left + 1
                    right = right -1 
                    while left < right and left != 0 and nums[left] == nums[left -1] :
                        left = left +1
                    while left < right and nums[right] != len(nums) and nums[right] == nums[right +1]:
                        right = right -1



                elif sumA < 0:
                    left = left +1
                else:
                    right = right - 1
        return result