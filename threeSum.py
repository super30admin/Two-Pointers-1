# Time Complexity :
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution(object):
    def threeSum(self, nums):
        result = []
        # edge case
        if not nums or len(nums) < 3:
            return result
        nums.sort()
        for i in range(len(nums) - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            low = i + 1
            high = len(nums) - 1
            while low < high:
                sum = nums[i] + nums[low] + nums[high]
                if sum < 0:
                    low += 1
                elif sum > 0:
                    high -= 1
                else:
                    result.append([nums[i], nums[low], nums[high]])
                    while low < high and nums[low] == nums[low + 1]:
                        low += 1
                    while low < high and nums[high] == nums[high - 1]:
                        high -= 1
                    low += 1
                    high -= 1
        return result
r = Solution()
nums = [-1, 0, 1, 2, -1, -4]
print("All unique triplets in the array are:",r.threeSum(nums))
