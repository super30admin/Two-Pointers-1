'''
Time complexity: O(n^2)
Space complexity: O(1)
'''
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        output = []
        nums.sort()
        for i in range(len(nums) - 1):
            if i != 0 and nums[i-1] == nums[i]:
                continue
            left = i + 1
            right = len(nums) - 1
            while left < right:
                sum = nums[i] + nums[left] + nums[right]
                if sum == 0:
                    output.append(list((nums[i], nums[left], nums[right])))
                    left = left + 1
                    right = right - 1
                    while left < right and nums[left - 1] == nums[left]:
                        left = left + 1
                    while left < right and nums[right + 1] == nums[right]:
                        right = right - 1
                elif sum < 0:
                    left = left + 1
                    while left < right and nums[left - 1] == nums[left]:
                        left = left + 1
                else:
                    right = right - 1
                    while left < right and nums[right + 1] == nums[right]:
                        right = right - 1
        return output