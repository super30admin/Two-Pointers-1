# Time Complexity : O(n^2)
# Space Complexity : O(n^2)
# Did this code successfully run on Leetcode : No
# Any problem you faced while coding this : Yes


# Your code here along with comments explaining your approach
# I was not able to use the hashing approach in the set. So my results have duplicates

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        three_sum_result = []
        bag = set()
        for i in range(len(nums)):
            target = 0 - nums[i]
            two_sums = self.twoSum(nums, target, i)
            print(nums[i],two_sums)
            for x in two_sums:
                if len(x) > 0:
                    if (nums[i] + x[0] not in bag) and (nums[i] + x[1] not in bag):
                        three_sum_result.append([x[0], x[1], nums[i]])
            bag.add(target)
        return three_sum_result
        
    def twoSum(self, nums, target, idx):
        ds = set()
        two_sum_result = []
        for i in range(idx+1, len(nums)):
            if nums[i] in ds:
                two_sum_result.append([nums[i], target-nums[i]])
                ds.remove(nums[i])
            else:
                ds.add(target - nums[i])
        return two_sum_result