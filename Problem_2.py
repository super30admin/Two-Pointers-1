# // Time Complexity : O(n^2)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : YES
# // Any problem you faced while coding this : Followed approach from class
# Three sum 
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        output = []
        for i in range(len(nums)):
            left = i + 1
            right = len(nums) - 1
            while left < right:
                if nums[left] + nums[right] > -nums[i]:
                    right -= 1
                elif nums[left] + nums[right] < -nums[i]:
                    left += 1
                else:
                    enter = [nums[i], nums[left], nums[right]]
                    enter.sort()
                    if enter not in output:
                        output.append(enter)
                    left += 1
        return output