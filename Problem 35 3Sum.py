# Did this code successfully run on Leetcode: Yes
# Time Complexity: O(n^2)
# Space Complexity: O(n) bcz if sorting
# Logic: Extend the approach to calculate 2 sum, sort the array keep i to the left most & for every i calculate sum for
# every j & k. if sum is 0 add in output else keep on checking. To avoid duplicates in output skip repeating elements.

class Solution:
    def threeSum(self, nums):
        self.output = []
        nums.sort()
        for i in range(len(nums)-2):
            if nums[i] > 0:
                break
            if i == 0 or nums[i] != nums[i-1]:
                self.twoSum(nums, i)
        return self.output

    def twoSum(self, nums, i):
        j = i + 1
        k = len(nums) - 1
        while j < k:
            sum = nums[i] + nums[j] + nums[k]
            if sum == 0:
                self.output.append([nums[i], nums[j], nums[k]])
                j += 1
                k -= 1
                while j < k and nums[j] == nums[j-1]:
                    j += 1
            elif sum < 0:
                j += 1
            else:
                k -= 1