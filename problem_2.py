#  Problem: https://leetcode.com/problems/3sum/
#  Time Complexity: O(N^2)
#  Space Complexity: O(1)

#  Approach: I am sorting the array and iterating over the array. 
#  For each element, I am finding the other two elements whose sum is equal to -element.
#  I am using two pointers left and right to find the other two elements.
#  I am skipping the duplicates to avoid duplicates in the result.


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()
        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            left = i + 1
            right = len(nums) - 1

            while left < right:
                s = nums[i] + nums[left] + nums[right] 
                if s == 0:
                    result.append([nums[i], nums[left] , nums[right]])
                    left += 1
                    right -= 1
                    while nums[left] == nums[left - 1] and left < right:
                        left = left + 1
                elif s < 0:
                    left += 1
                else:
                    right -= 1