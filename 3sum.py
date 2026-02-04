''' 
Time Complexity : O(n^2) 
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this :  No
'''
class Solution:
    def threeSum(self, nums):
        n = len(nums)
        result = []
        nums.sort()
        for i in range(n - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            left = i + 1
            right = n - 1

            while left < right:
                total = nums[i] + nums[left] + nums[right]

                if total == 0:
                    result.append([nums[i], nums[left], nums[right]])
                    left += 1
                    right -= 1

                    while left < right and nums[left] == nums[left - 1]:
                        left += 1

                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1

                elif total < 0:
                    left += 1
                else:
                    right -= 1

        return result



s = Solution()
nums = [-1,0,1,2,-1,-4]
print(s.threeSum(nums))
nums = [0,1,1]
print(s.threeSum(nums))
nums = [0,0,0]
print(s.threeSum(nums))
